package practice03;

public class StringUtil {
    
    public static String concatString(String[] arr){
       
        //메소드 내용작성
    		String result = "";
    		for(int i=0; i < arr.length; i++) {
    			//System.out.println(arr[i]);
    			result += arr[i];
    		}
    	
    		
        return result;
    }

}
