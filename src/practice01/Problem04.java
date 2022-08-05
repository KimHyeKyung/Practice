package practice01;
import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		//내가 작성한 코드 -> 배열을 이용하여 작성했다.
//		int max = 0;
//		Scanner sc =  new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//
//		for(int i=0; i<5; i++) {
//			System.out.print("숫자: ");
//			int[] arrInput = new int[5]; 
//			arrInput[i] = sc.nextInt();
//			
//			if(arrInput[i] > max) {
//				max = arrInput[i];
//			}
//		}
//		System.out.println("최대값은 "+max+"입니다.");
//		sc.close();
		
		
		//쌤이 작성한 코드
		int max = 0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			int temp = sc.nextInt();

			if(temp > max) {
				max = temp;
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		sc.close();
		
		
		
		
	}

}
