package tut06.shape2d;

public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, Colors color, boolean filled) {
		super(side, side, color, filled);
	}

	public Square(double side, Colors color, boolean filled, Point2D position) {
		super(side, side, color, filled, position);
	}

	public double getSide() {
//		return this.getLength();
		return this.getWidth();
	}

	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}

	public void setWidth(double side) {
		this.setSide(side);
	}

	public void setLength(double side) {
		this.setSide(side);
	}

	@Override
	public double getArea() {
		return this.getArea();
	}

	@Override
	public double getPerimeter() {
		return this.getPerimeter();
	}

	@Override
	public String toString() {
		return "Square[side=" + this.getSide() + "," + super.toString() + "]";
	}

}
