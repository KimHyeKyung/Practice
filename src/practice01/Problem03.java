package practice01;
public class Problem03 {

	public static void main(String[] args) {
		
		for(int dan = 1; dan <= 9; dan++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j + "*" + dan + "=" + j*dan);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
