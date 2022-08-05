import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String retry;
            int num = (int) (Math.random() * 100) + 1;
            int inputNum;

            System.out.println("========================");
            System.out.println("    [숫자맞추기게임 시작]");
            System.out.println("========================");
            while (true) {

                System.out.print(">>");
                //사용자 입력값 받기
                inputNum = sc.nextInt();
                System.out.println(inputNum);
                
                //입력한 값 높은지 낮은지 맞추었는지 판단
                //사용자가 입력한 숫자가 랜덤숫자보다 작을때
                if(inputNum < num) {
                	System.out.println("더 높게");
                }else if(inputNum > num){
                	System.out.println("더 낮게");
                }else {
                	System.out.println("맞았습니다.");
                	break;
                }
            }
            
            sc.nextLine();	//입력 버퍼 비우기
            System.out.print("게임을 종료하시겠습니까?(y/n) >>");
            retry = sc.next();
            
            if ("y".equals(retry)) {
        	  System.out.println("========================");
              System.out.println("    [숫자맞추기게임 종료]");
              System.out.println("========================");
              break;
            }else {
            	continue;
            }
        }
        //sc.close();

	}

}
