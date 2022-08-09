package practice03;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
		super();
	}
    
    public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
    
    public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	//필요한 메소드 작성
    public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance<money) {
			System.out.println("잔고가 부족합니다.");
		}else {
			balance -= money;		
		}
	}
	public void showBalance() {
		System.out.println(balance);
		
	}
    
}
