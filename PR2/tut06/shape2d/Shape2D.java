package tut06.shape2d;

public abstract class Shape2D implements Shape2DCalculation {
	private Colors color = Colors.White;
	private boolean filled = false;
	private Point2D position = new Point2D();

	public Shape2D() {
	}

	public Shape2D(Point2D position) {
		this.position = position;
	}
	
	public Shape2D(Colors color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public Shape2D(Colors color, boolean filled, Point2D position) {
		this.color = color;
		this.filled = filled;
		this.position = position;
	}

	/**
	 * @return the color
	 */
	public Colors getColor() {
		return this.color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Colors color) {
		this.color = color;
	}

	/**
	 * @return the filled
	 */
	public boolean isFilled() {
		return this.filled;
	}

	/**
	 * @param filled the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * @return the position
	 */
	public Point2D getPosition() {
		return this.position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Point2D position) {
		this.position = position;
	}

	public String toString() {
		return "Shape2D[color=" + this.getColor() + ",filled status=" + this.isFilled() + ",position="
				+ this.getPosition().toString() + "]";
	}
}
