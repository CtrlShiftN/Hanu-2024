package tut05.a05;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;

	public Student(String name) {
		super(name);
	}

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	/**
	 * @return the program
	 */
	public String getProgram() {
		return this.program;
	}

	/**
	 * @param program the program to set
	 */
	public void setProgram(String program) {
		this.program = program;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the fee
	 */
	public double getFee() {
		return this.fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student[" + super.toString() + ", program=" + this.getProgram() + ", year=" + this.getYear() + ", fee="
				+ this.getFee() + "]";
	}

}
