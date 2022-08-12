package javaTest.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/*
 * 2022.08.12
 * 
 */
public class AccountApp {
	public static void main(String[] args) {
		System.out.println("by 김혜경");
		Scanner sc = new Scanner(System.in);
		System.out.print(">>계좌번호를 입력하세요: ");
		String line = sc.nextLine();
		File file = new File("D:\\javaStudy" + line + ".txt");
		File fileInfo = new File("D:\\javaStudy\\AccountNumber.txt"); // 고객 정보 파일
		FileWriter fout = null;

		// 현재 날짜
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String today = now.format(time);

		try {
			boolean run = true;
			int money;
			String accBalance = "-";
			boolean fileExist = false;
			Account account = new Account(line);
			ArrayList<Account> accInfo = new ArrayList<Account>();

			// 고객 정보 가져오기
			if (fileInfo.exists()) {
				FileReader fr = new FileReader(fileInfo);
				BufferedReader br = new BufferedReader(fr);
				String info;
				String[] s;
				while ((info = br.readLine()) != null) {
					s = info.split(" ");
					String accNo = s[0];
					String accName = s[1];
					String accPhone = s[2];
					accInfo.add(new Account(accNo, accName, accPhone));
				}
			}
			
			// 현재 조회하는 고객 정보 저장
			for (int i = 0; i < accInfo.size(); i++) {
				if (line.equals(accInfo.get(i).accountNo())) {
					account = new Account(line, accInfo.get(i).getName(), accInfo.get(i).getPhone());
				}
			}

			// 계좌번호가 존재하면, 잔액 가져오기
			if (file.exists()) {
				fileExist = true;
				System.out.println(">>기존 고객 입니다.");
				// 입력 스트림 생성
				FileReader filereader = new FileReader(file);
				// 입력 버퍼 생성
				BufferedReader bufReader = new BufferedReader(filereader);
				String balresult = "";
				while ((balresult = bufReader.readLine()) != null) {
					String[] s = balresult.split("\t");
					accBalance = s[(s.length) - 1];
				}
				fout = new FileWriter(file, true);
//				bufReader.close();
			} else {
				// line 입력받은거 정보 나누기
				System.out.print(">>신규 고객 입니다. 성명과 연락처를 입력해주세요.\n>>");
				String info = sc.nextLine();
				String[] s = info.split(" ");
				account = new Account(line, s[0], s[1]);

				// 신규 고객 정보 저장하기
				fout = new FileWriter(fileInfo, true);
				fout.append(line + " " + account.getName() + " " + account.getPhone() + "\r\n");
				fout.close();

				file = new File("D:\\javaStudy\\Account" + line + ".txt");
				fout = new FileWriter(file, true);
				fout.write("계좌:" + line + ", 성명:" + account.getName() + ", 연락처:" + account.getPhone() + "\r\n");
				fout.write("------------------------------------------------\n");
				fout.write("날짜\t\t예금\t출금\t잔액\n");
				fout.write("------------------------------------------------\n");
			}

			if (fileExist)
				account.setBalance(Integer.parseInt(accBalance, 10));
			System.out.println("계좌: " + line + ", 성명: " + account.getName() + ", 연락처: " + account.getPhone());
			
			while (run) {
				System.out.println();
				System.out.println("-------------------------------------------");
				System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.거래내역조회 | 5.종료");
				System.out.println("-------------------------------------------");
				System.out.print("선택> ");
				int menuNo = sc.nextInt();
				switch (menuNo) {
				case 1:
					System.out.print("예금액> ");
					money = sc.nextInt();
					account.deposit(money);
					fout.append(today + "\t+" + money + "\t" + 0 + "\t" + account.showBalance() + "\n");
					break;
				case 2:
					System.out.print("출금액> ");
					money = sc.nextInt();
					account.withdraw(money);
					fout.append(today + "\t" + 0 + "\t-" + money + "\t" + account.showBalance() + "\n");
					break;
				case 3:
					System.out.print("잔고액> ");
					System.out.println(account.showBalance()); 
					break;
				case 4:
					String[] s;
					System.out.print("조회 시작 날짜와 끝 날짜를 입력해주세요(yyyy-MM-dd)\n시작>> ");
					String dayStart = sc.next();
					System.out.print("종료>> ");
					String dayEnd = sc.next();

					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String info;
					ArrayList<Account> lineInfo = new ArrayList<Account>();

					System.out.println("-------------------------------------------\n"
							+ "조회결과>> 날짜\t\t예금\t출금\t잔액\n-------------------------------------------");
					
					while ((info = br.readLine()) != null) {
						s = info.split("\t");

						if (s.length == 4) {
							String date = s[0];
							int inMoney = Integer.parseInt(s[1]);
							int outMoney = Integer.parseInt(s[2], 10);
							int totalMoney = Integer.parseInt(s[3], 10);
							lineInfo.add(new Account(date, inMoney, outMoney, totalMoney));
						}
					}
					// 날짜 비교해서 거래내역 출력
					for (int i = 0; i < lineInfo.size(); i++) {
						if (changeDateType(dayStart) <= changeDateType(lineInfo.get(i).getDate())) {
							if (changeDateType(dayEnd) >= changeDateType(lineInfo.get(i).getDate())) 
								lineInfo.get(i).checkAccount();
						}
					}
					break;
				case 5:
					System.out.println("종료");
					fout.close();
					sc.close();
					run = false;
					break;
				default:
					System.out.println("다시 입력해주세요.");
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("입출력오류");
			e.printStackTrace();
		}

	}

	public static int changeDateType(String day) {
		String[] yMd = day.split("-");
		String s = "";

		for (int i = 0; i < yMd.length; i++) {
			s = s.concat(yMd[i]);
		}
		int date = Integer.parseInt(s);
		return date;
	}
}
