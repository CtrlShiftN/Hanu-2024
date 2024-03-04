package tut05.shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println("Empty shape: " + shape.toString());
		Shape shape1 = new Shape("blue", false);
		System.out.println(" Demo shape: " + shape1.toString());
		Circle c1 = new Circle();
		System.out.println("Empty circle: " + c1.toString());
		Circle c2 = new Circle(2);
		System.out.println("Radius circle: " + c2.toString());
		Circle c3 = new Circle(3, "blue", false);
		System.out.println("Radius circle: " + c3.toString());
		Rectangle r1 = new Rectangle();
		System.out.println("Empty rectangle: " + r1.toString());
		Rectangle r2 = new Rectangle(3, 4);
		System.out.println("Def rectangle: " + r2.toString());
		System.out.println("Def area: " + r2.getArea());
		System.out.println("Def perimeter: " + r2.getPerimeter());
		Rectangle r3 = new Rectangle(5, 6, "blue", false);
		System.out.println("Full rectangle: " + r3.toString());
		System.out.println("Full area: " + r3.getArea());
		System.out.println("Full perimeter: " + r3.getPerimeter());
		Square s1 = new Square();
		System.out.println("Empty square: " + s1.toString());
		Square s2 = new Square(3);
		System.out.println("Def square: " + s2.toString());
		System.out.println("Def area: " + s2.getArea());
		System.out.println("Def perimeter: " + s2.getPerimeter());
		Square s3 = new Square(4, "blue", false);
		System.out.println("Full square: " + s3.toString());
		System.out.println("Full area: " + s3.getArea());
		System.out.println("Full perimeter: " + s3.getPerimeter());
	}
}
