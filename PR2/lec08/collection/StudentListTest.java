package lec08.collection;

import java.util.*;

public class StudentListTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Nam"));
		studentList.add(new Student("Anh"));
		studentList.add(new Student("Son"));
		for (Student student : studentList) {
			System.out.print(student.getName() + " ");
		}
		Comparator<Student> comAsc = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		Comparator<Student> comDesc = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};

		Collections.sort(studentList, comAsc);
		System.out.println();
		for (Student student : studentList) {
			System.out.print(student.getName() + " ");
		}

		Collections.sort(studentList, comDesc);
		System.out.println();
		for (Student student : studentList) {
			System.out.print(student.getName() + " ");
		}
	}

}
