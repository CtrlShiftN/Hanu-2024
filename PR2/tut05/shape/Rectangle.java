package tut05.shape;

public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return this.width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return this.length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return this.width * this.length;
	}

	public double getPerimeter() {
		return (this.width + this.length) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ", width=" + this.getWidth() + ",length=" + this.getLength() + "]";
	}
}
