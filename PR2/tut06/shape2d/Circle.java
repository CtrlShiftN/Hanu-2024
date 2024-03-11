package tut06.shape2d;

public class Circle extends Shape2D {
	private double radius = 1.0;
	private final double PI = Math.PI;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, Colors color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(double radius, Colors color, boolean filled, Point2D position) {
		super(color, filled, position);
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

	@Override
	public double getArea() {
		return this.radius * this.radius * PI;
	}

	@Override
	public double getPerimeter() {
		return this.radius * PI * 2;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + this.getRadius() + "," + super.toString() + "]";
	}

}
