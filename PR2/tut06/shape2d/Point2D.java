package tut06.shape2d;

public class Point2D {
	private double x = 0.0;
	private double y = 0.0;

	public Point2D() {}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return x
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return y
	 */
	public double getY() {
		return this.y;
	}

	public double getDistanceTo(double x, double y) {
		// Solved 01
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}

	public double getDistanceTo(Point2D p) {
		// Solved 02
		double deltaX = p.getX() - this.x;
		double deltaY = p.getY() - this.y;
//		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}

	public String toString() {
		return "Point2D[x=" + this.getX() + ",y=" + this.getY() + "]";
	}

}
