package practice03;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1154.42);
        
        
        //백만원을 달러로 출력
        dollar = CConverter.toDoller(1000000);
        System.out.println("백만원은 "+dollar+"달러입니다.");
        
        //100달러를 원으로 출력
        won = CConverter.toKRW(100);
        System.out.println("백달러는 "+won+"원 입니다.");
    }

}
