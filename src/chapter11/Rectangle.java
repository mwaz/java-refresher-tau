package chapter11;

public class Rectangle extends Shape {

	public double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double width;

	public Rectangle(double length, double width){
		setLength(length);
		setWidth(width);
	}


	@Override
	double calculateArea() {
		return length * width;
	}
}
