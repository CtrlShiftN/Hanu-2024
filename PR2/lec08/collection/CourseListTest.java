package lec08.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CourseListTest {

	public static void main(String[] args) {
		List<Course> courseList = new ArrayList<>();
		courseList.add(new Course("Java", 203));
		courseList.add(new Course("PHP", 210));
		courseList.add(new Course("Python", 120));
		Collections.sort(courseList); // DESC order
		for (Course course : courseList) {
			System.out.print(course.getName() + ": " + course.getNumberOfStudent() + " - ");
		}
	}

}
