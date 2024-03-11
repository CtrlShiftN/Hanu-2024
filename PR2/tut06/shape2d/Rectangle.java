package tut06.shape2d;

public class Rectangle extends Shape2D {
	private double length = 1.0;
	private double width = 1.0;

	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width, Colors color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width, Colors color, boolean filled, Point2D position) {
		super(color, filled, position);
		this.length = length;
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

	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + this.getLength() + ",width=" + this.getWidth() + "," + super.toString() + "]";
	}

}
