package practice02;

public class problem05 {

	public static void main(String[] args) {
		 int[] no = new int[6];
	        for(int i=0 ; i<no.length; i++){
	            no[i] = (int)(Math.random()*45)+1;
	            System.out.println(" no[i] : no["+i+"]"+no[i]);
	            //중복검사
	            //i 는 현재 입력된 방번호 <--중복인지 검사해야됨
	            //j 비교대상 [0]부터 순서대로 검사해서 i 이전방까지 검사
	            //비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
	            if(i == 0) {
	            	continue;
	            }
	            for(int j=0; j<i; j++){
	            	if(no[j] == no[i]) {
	            		i--;
	            		break;
	            	}
		        }
	            
	        }
	        System.out.println();
	        for(int j=0; j<no.length; j++){
	            System.out.print(no[j] + "  ");
	        }
	}

}
