package tut04;

public class Point2dTest {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(1.5, 5.5);
		Point2D p2 = new Point2D(-5.3, -4.4);
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(-5.3, -4.4));
	}

}
