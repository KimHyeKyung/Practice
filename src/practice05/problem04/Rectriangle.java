package practice05.problem04;

public class Rectriangle extends Shape{

	double width;
	double height;

	public Rectriangle(int countSides) {
		super(countSides);
	}
	
	public Rectriangle( double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}
	
	public Rectriangle(int countSides, double width, double height) {
		super(countSides);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		double result = (this.width * this.height) * 0.5;
		return result;
	}

	@Override
	public double getPerimeter() {
		return this.width + this.height + Math.sqrt(Math.pow(this.width,2)+Math.pow(this.height,2)) ;
	}

	
}
