package lec08.collection;

public class Student {
	private String name; // mutable = false /\ optional = false /\ length <= 50
	private String email; // mutable = true /\ optional = true /\ length <= 100
	
	public Student(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
}
