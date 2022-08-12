package practice05.problem04;

public class Goods {

    private String name;
    private int price;
    private int count;
    
    
	public Goods() {
		super();
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}


	public void showInfo() {
		System.out.println(name + "(가격: " + price + "원)이 " + count + "개 입고 되었습니다.");
	}

    
}

