package practice05.problem04;

public abstract class Shape {

	private int countSides;	//변의 수

	public Shape(int countSides) {
		super();
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}

	public abstract double getArea();	//넓이
	public abstract double getPerimeter();	//둘레길이
	
}
