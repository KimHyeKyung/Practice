package practice03;

public class Book {

	private int bookNo;		//번호
	private String title;	//제목
	private String author;	//작가
	private int stateCode;	//대여유무를 나타내는 상태코드
    
	public Book() {
		super();
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent() {
		if(stateCode==0) {
			System.out.println("이미 대여중입니다. 다른 도서를 선택해주세요.");
		}else if(stateCode == 99){
			stateCode = 1;
			System.out.println(title + "을(를) 반납합니다.");
		}else {
			stateCode = 0;
			System.out.println(title + "이(가) 대여되었습니다.");
		}
		
	}
	
	public void returnBook() {
		stateCode = 1;
		System.out.println(title + "을(를) 반납합니다.");
	}
	
	public void print() {
		if(stateCode == 0) {
			System.out.println(bookNo+" | 책제목: "+title+" | 저자: "+author+" | 대여유무: '대여중'");
		}else {
			System.out.println(bookNo+" | 책제목: "+title+" | 저자: "+author+" | 대여유무: 재고있음");
		}
	}

	
	
}
