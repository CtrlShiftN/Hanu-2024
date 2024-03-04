package tut05.a05;

public class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name) {
		super(name);
	}

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return this.school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the pay
	 */
	public double getPay() {
		return this.pay;
	}

	/**
	 * @param pay the pay to set
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff[" + super.toString() + ", school=" + this.getSchool() + ", pay=" + this.getPay() + "]";
	}
}
