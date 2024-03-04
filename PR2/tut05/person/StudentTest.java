package tut05.person;

public class StudentTest {

	public static void main(String[] args) {
		Student nam = new Student("Nam", "Hanoi", "FIT", 2024, 3200);
		System.out.println(nam.toString());
		Staff lan = new Staff("Lan", "Hanoi", "Hanu", 2000);
		System.out.println(lan.toString());
	}

}
