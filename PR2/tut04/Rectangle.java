package tut04;

public class Rectangle{
	  private float width;
	  private float height;

	  public Rectangle() {
		  this.width = 1.0f;
		  this.height = 1.0f;
	  }

	  public Rectangle(float width, float height) {
	    this.width = width;
	    this.height = height;
	  }

	  /** Return width */
	  public double getWidth() {
	    return width;
	  }

	  /** Set a new width */
	  public void setWidth(float width) {
	    this.width = width;
	  }

	  /** Return height */
	  public double getHeight() {
	    return height;
	  }

	  /** Set a new height */
	  public void setHeight(float height) {
	    this.height = height;
	  }

	  public float getArea() {
	    return width * height;
	  }

	  public float getPerimeter() {
	    return 2 * (width + height);
	  }

	  @Override /** Return a string representation of a Rectangle object */
	  public String toString() {
	    return "Rectangle[width=" + width + ",height=" + height+"]";
	  }
	}
