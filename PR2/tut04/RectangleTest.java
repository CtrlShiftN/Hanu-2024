package tut04;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
		System.out.println(r1);
		Rectangle r2 = new Rectangle();
		System.out.println(r2);

		r1.setHeight(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.printf("Length is: %.2f%n", r1.getHeight());
		System.out.printf("Width is: %.2f%n", r1.getWidth());

		System.out.printf("Area is: %.2f%n", r1.getArea());
		System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());

	}

}
