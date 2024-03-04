package tut05.point;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println(p1.toString());
		Point p2 = new Point(2.3f, 3.4f);
		System.out.println(p2.toString());
		MovablePoint mp1 = new MovablePoint();
		System.out.println(mp1.toString());
		MovablePoint mp2 = new MovablePoint(2.3f, 3.4f);
		System.out.println(mp2.toString());
		MovablePoint mp3 = new MovablePoint(1.2f, 1.5f, 2.3f, 3.4f);
		System.out.println(mp3.toString());
		MovablePoint mp4 = new MovablePoint(2.3f, 3.4f);
		System.out.println(mp4.toString());
		mp4.move();
		System.out.println(mp4.toString());
	}

}
