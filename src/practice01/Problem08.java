package practice01;
import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		boolean run = true;
		int money = 0;
		
		while (run) {
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");

			int menuNo = sc.nextInt();
			
			switch (menuNo) {

			case 1: // 예금일때
				System.out.print("예금액>");
				money = sc.nextInt();
				sum += money;
				System.out.println("잔액 : "+sum);
				break;

			case 2: // 출금일때
				if(sum == 0) {
					System.out.println("잔액이 없습니다. 입금 후 이용해주세요.");
				}else {
					System.out.println("잔액 : "+sum);
					System.out.print("출금액>");
					money = sc.nextInt();
					sum -= money;
					System.out.println("출금 후 잔액 : "+sum);
					break;
				}

			case 3: // 잔고일때
				System.out.println("잔액 : "+sum);
				break;

			case 4: // 종료일때
				run = false;
				break;

			default: // 메뉴이외의 번호일때
				System.out.println("다시입력해주세요");
				break;

			}// switch

		} // while

		System.out.print("프로그램 종료");
		sc.close();
	}

}
