package tut04;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double distance(double x, double y) {
		// Solved 01
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}

	public double distance(Point2D p) {
		// Solved 02
		double deltaX = p.getX() - this.x;
		double deltaY = p.getY() - this.y;
//		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}

}
