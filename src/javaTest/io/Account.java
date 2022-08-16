package javaTest.io;

public class Account {
//-----------------------------------
//	멤버변수
//-----------------------------------
	String accountNum;	//계좌번호
	String name;		//고객이름
	String phone;		//전화번호
	int money;			//사용자가 입급/출금한 돈
	int balance;		//총 잔액
	int inMoney;		//입금된 돈
	int outMoney;		//출금된 돈
	int totalMoney;		//각각 거래 후 잔액
	String date;		//날짜
//-----------------------------------
//	get/set
//-----------------------------------
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

//----------------------------------
//	생성자
//-----------------------------------
	public Account(String line) {
		this.accountNum = line;
	}
	
	public Account(String accountNum, String name, String phone) {
		this.accountNum = accountNum;
		this.name = name;
		this.phone = phone;
	}

	public Account(String accountNum, String name, String phone, int balance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.phone = phone;
		this.balance = balance;
	}
	
	public Account(String date, int inMoney, int outMoney, int totalMoney) {
		this.date = date;
		this.inMoney = inMoney;
		this.outMoney = outMoney;
		this.totalMoney = totalMoney;
	}
	
//----------------------------------
//	메서드
//-----------------------------------
	//계좌번호 조회
	public String accountNo() {
		return accountNum;
	}

	//입금
	public void deposit(int money) {
		this.money = money;
		this.balance += money;
	}

	//출금
	public void withdraw(int money) {
		this.money = money;
		if(balance < money) {
			System.out.println("잔액이 부족합니다.");
		}else {
			this.balance -= money;
		}
	}

	//잔액조회
	public int showBalance() {
		return this.balance;
	}

	// 날짜 비교해서 거래내역 출력
	public void checkAccount() {
		System.out.println(this.date + "\t\t" + this.inMoney+"\t"+ this.outMoney +"\t" + this.totalMoney);
	}
	
	
}
