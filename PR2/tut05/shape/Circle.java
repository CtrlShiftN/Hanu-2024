package tut05.shape;

public class Circle extends Shape {
	private double radius = 1.0;
	private final double PI = Math.PI;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return this.radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return this.radius * this.radius * PI;
	}

	public double getPerimeter() {
		return this.radius * PI * 2;
	}

	@Override
	public String toString() {
		return "Circle[" + super.toString() + ", radius=" + this.getRadius() + "]";
	}
}
