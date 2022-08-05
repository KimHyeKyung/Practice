package practice02;

import java.util.Scanner;

public class problem04 {

	public static void main(String[] args) {
		 int[] wonArray = new int[10];
	        wonArray[0] = 50000;
	        wonArray[1] = 10000;
	        wonArray[2] = 5000;
	        wonArray[3] = 1000;
	        wonArray[4] = 500;
	        wonArray[5] = 100;
	        wonArray[6] = 50;
	        wonArray[7] = 10;
	        wonArray[8] = 5;
	        wonArray[9] = 1;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("금액: ");
	        int money = sc.nextInt();
	        int count = 0;
	        int won = money;
	        
	        for(int i=0; i<wonArray.length; i++){
	            //코드작성
	        	count = won / wonArray[i];
	        	won = won - wonArray[i]*count;
    			if(won < 0) {
    				continue;
    			}
	            System.out.println(wonArray[i] + "원:" + count + "개");
	        }
	        sc.close();
	}

}
