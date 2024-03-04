package tut05.a05;

public class PersonTest {

	public static void main(String[] args) {
		Student lan = new Student("Lan");
		System.out.println(lan.toString());
		Student nam = new Student("Nam", "Hanoi", "FIT", 2024, 2000);
		System.out.println(nam.toString());
		Staff nhan = new Staff("Nhan");
		System.out.println(nhan.toString());
		Staff nga = new Staff("Nga", "Hanoi", "Hanu", 2000);
		System.out.println(nga.toString());
		nga.setPay(2500);
		System.out.println(nga.toString());
	}

}
