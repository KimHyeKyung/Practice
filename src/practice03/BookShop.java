package practice03;
import java.util.Scanner;
public class BookShop {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	boolean run = true;
    	Book[] books = new Book[10];
    	 books[0] = new Book(1, "트와일라잇", "스테파니메이어");
         books[1] = new Book(2, "뉴문", "스테파니메이어");
         books[2] = new Book(3, "이클립스", "스테파니메이어");
         books[3] = new Book(4, "브레이킹던", "스테파니메이어");
         books[4] = new Book(5, "아리랑", "조정래");
         books[5] = new Book(6, "젊은그들", "김동인");
         books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
         books[7] = new Book(8, "귀천", "천상병");
         books[8] = new Book(9, "태백산맥", "조정래");
         books[9] = new Book(10, "풀하우스", "원수연");

         System.out.println("*****도서 정보 출력하기******");
         System.out.println("*****도서 반납:99, 종료:0 ******");
         displayBookInfo(books);
         
    	while(run) {
            System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
            int num = scanner.nextInt();
            if(num == 0) {
            	run = false;
            	System.out.println("도서대여를 종료합니다.");
            }else if(num == 99) {
            	System.out.print("반납하실 책 번호를 입력해주세요:");
            	int returnNum = scanner.nextInt();
            	for(int i = 0; i<books.length; i++) {
                    if(books[i].getBookNo() == returnNum) {
                    	books[i].returnBook();
                    	displayBookInfo(books);
            		}
                }
    		}else {
            	// (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.
                for(int i = 0; i<books.length; i++) {
                    if(books[i].getBookNo() == num) {
                    	books[i].rent();
            		}
                }
                System.out.println("*****도서 정보 출력하기******");
                displayBookInfo(books);
            }
        }//while종료
    	scanner.close();
    }//main종료
    
    //(2)전달받은 배열을 모두 출력하는 메소드
    private static void displayBookInfo(Book[] books) {
    	//코드작성
    	for(int i=0; i<books.length; i++) {
    		books[i].print();
    	}
    }
}