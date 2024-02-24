package tut04;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	private final double PI = Math.PI;
	
	public Circle() {
//		this.radius = 1.0;
//		this.color = "red";
	}
	
	public Circle(double radius) {
		this.radius = radius;
//		this.color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getArea() {
		return this.radius * this.radius * PI;
	}
}
