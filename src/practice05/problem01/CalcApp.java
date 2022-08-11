package practice05.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	int result;
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">>");
        	String s = sc.nextLine();
    		
        	if(s.equals("/q")) {
        		System.out.println("종료합니다.");
        		break;
        	}
        	
        	String[] sArray = s.split(" ");
        	String middle = sArray[1];
        	int a = Integer.parseInt(sArray[0]);
    		int b = Integer.parseInt(sArray[2]);
    		
			switch(middle) {
        	case("+"):
        		Add add = new Add();
        		add.setValue(a, b);
        		result = add.calculate();
        		System.out.println(">> " + result);
        		break;
        	case("-"):
        		Sub sub = new Sub();
        		sub.setValue(a, b);
    			result = sub.calculate();
        		System.out.println(">> " + sub.calculate());
        		break;
        	case("*"):
        		Mul mul = new Mul();
        		mul.setValue(a, b);
	    		result = mul.calculate();
	    		System.out.println(">> " + mul.calculate());
	    		break;
        	case("/"):
        		Div div = new Div();
        		div.setValue(a, b);
    			result = div.calculate();
        		System.out.println(">> " + div.calculate());
        		break;
        	default:
        		System.out.println("알 수 없는 연산자입니다.");
        		break;
        	}
        	
    	}
    	sc.close();
        	
    }
}
