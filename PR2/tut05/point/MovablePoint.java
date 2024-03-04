package tut05.point;

public class MovablePoint extends Point {
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;

	public MovablePoint() {
		super();
	}

	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public float[] getSpeed() {
		float[] speed = { this.getxSpeed(), this.getySpeed() };
		return speed;
	}

	public void setSpeed(float xSpeed, float ySpeed) {
		this.setxSpeed(xSpeed);
		this.setySpeed(ySpeed);
	}

	public MovablePoint move() {
		this.setX(this.getX() + this.getxSpeed());
		this.setY(this.getY() + this.getySpeed());
		return this;
	}

	@Override
	public String toString() {
		return super.toString() + ", speed=(" + this.getxSpeed() + "," + this.getySpeed() + ")";
	}
}
