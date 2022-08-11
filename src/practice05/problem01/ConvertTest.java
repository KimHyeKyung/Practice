package practice05.problem01;

public class ConvertTest {

	public static void main(String[] args) {
		String s = "5 + 3";

		String[] sArray = s.split(" ");
		
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		System.out.println(sArray[2]);
		
		//parseInt -> String을 받아서 int로 변환해줌
		int a = Integer.parseInt(sArray[0]);
		int b = Integer.parseInt(sArray[2]);
		System.out.println(a+b);
	}

}
