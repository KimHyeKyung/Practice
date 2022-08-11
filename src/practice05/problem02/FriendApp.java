package practice05.problem02;

import java.util.ArrayList;
import java.util.Scanner;


public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Friend> friendList = new ArrayList<>();	//ArrayList

		System.out.println("친구를 3명 등록해 주세요");
		for (int i = 0; i < 3; i++) {
			// 친구정보 입력받기
			String temp = sc.nextLine();

			// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
			String[] tempArr = temp.split(" ");
			String name = tempArr[0];
			String hp = tempArr[1];
			String school = tempArr[2];
			
			// Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
			Friend f = new Friend(name, hp, school);
			
			// 리스트에 추가하기 ( friendList <- friend객체 )
			friendList.add(f);
		}

		// 친구정보 출력
		for (int i = 0; i < friendList.size(); i++) {
			friendList.get(i).showInfo();
		}
		sc.close();

		
		
	}

}
