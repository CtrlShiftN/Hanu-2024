package tut05.a05;

public class Person {
	private String name;
	private String address;

	/**
	 * @param name
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 * @param address
	 */
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "Person[name=" + this.getName() + ",address=" + this.getAddress() + "]";
	}
}
