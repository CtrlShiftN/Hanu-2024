package lec08.collection;

public class Course implements Comparable<Course> {
	private String name;
	private int numberOfStudent;
	
	public Course(String name, int numberOfStudent) {
		this.name = name;
		this.numberOfStudent = numberOfStudent;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numberOfStudent
	 */
	public int getNumberOfStudent() {
		return this.numberOfStudent;
	}

	/**
	 * @param numberOfStudent the numberOfStudent to set
	 */
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	@Override
	public int compareTo(Course c) {
		return c.getNumberOfStudent() - this.getNumberOfStudent();
	}
	
	
}
