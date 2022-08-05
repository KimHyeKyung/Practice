package practice01;
public class Problem05 {

	public static void main(String[] args) {
		
		//내가한것
//		for(int i = 1; i<= 10; i++) {
//			for(int j = i; j<=i+9; j++) {
//				System.out.print(j);
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
		
		//쌤이한것
		for(int temp = 1; temp<= 10; temp++) {
			for(int i = temp; i<temp+10; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		 
	}

}
