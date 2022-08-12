package practice05.problem04;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		ArrayList<Goods> goodsList = new ArrayList<>();	//ArrayList
		int totalCount = 0;
		System.out.println("상품 3개를 등록해 주세요");
		for (int i = 0; i < 3; i++) {
			// 정보 입력받기
			String temp = sc.nextLine();

			// 입력받은 정보를 공백으로 분리 String 클래스에 split(" ") -> array
			String[] tempArr = temp.split(" ");
			String name = tempArr[0];
			//string -> int로 변환해서 넣기
			int price = Integer.parseInt(tempArr[1]);
			int count = Integer.parseInt(tempArr[2]);
			
			// Goods 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
			Goods g = new Goods(name, price, count);
			
			// 리스트에 추가하기 ( friendList <- friend객체 )
			goodsList.add(g);
		}

		// 정보 출력
		for (int i = 0; i < goodsList.size(); i++) {
			goodsList.get(i).showInfo();
		}
		
		Goods g = new Goods();
		for(int j=0; j<3; j++) {
			totalCount += g.getCount();
			System.out.println(totalCount);
		}
		
		
		sc.close();
    }
    
   
}
