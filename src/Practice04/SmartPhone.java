package Practice04;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	 if("음악".equals(str)){
             playMusic();
         }else if("앱".equals(str)){
        	 app();
         }else {
        	 super.execute(str);
         }
    }
 
    //메소드작성
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    //메소드작성
    public void app() {
    	System.out.println("앱실행");
    }
    
    
}
