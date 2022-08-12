package practice05.problem04;

public class Rectangle extends Shape implements Resizeable{
	
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	public double resize(double s) {
		width = this.width*s;
		height = this.height*s;
		double result = width*height;
		return result;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		double result = (width + height) *2;
		return result;
	}
}
