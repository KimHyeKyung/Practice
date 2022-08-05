package practice01;
import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int i;
		//int startNum;
		int sum =0 ;
		
		//코드작성
		for(i = num ; num>=1; num--) {
			sum = sum+num;
			num--;
		}
		
		System.out.println("결과값: " + sum);
		sc.close();
	
	
	//쌤이 작성한것
//	int num = sc.nextInt();	//임의의 숫자 대기
//	int i;					//for문의 초기값 변수
//	int startNum;			//for문의 초기값 변수에 전달할 겂(1,2)
//	int sum =0 ;			//누적 값 변수
//	
//	//코드작성
//	//1.짝수인지 홀수인지 판단
//	//2.짝수/홀수에 따른 for loop(2씩 증가후 누적)
//	
//	//1.
//	if(num%2==0) {
//		startNum = 2;
//	}else {
//		startNum = 1;
//	}
//	
//	//2.
//	for(i = startNum ; i<=num; i+=2) {  //i+=2  -> i=i+2
//		sum += i;
//	}
//	
//	System.out.println("결과값: " + sum);
//	sc.close();
	}
}
