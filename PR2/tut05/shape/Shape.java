package tut05.shape;

public class Shape {
	private String color = "red";
	private boolean filled = true;

	public Shape() {
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
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

	public String toString() {
		return "Shape [color=" + this.getColor() + ", filled=" + this.isFilled() + "]";
	}

}
