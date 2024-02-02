package tut03;

public class Person {
	private String name;
	private String birthday;
	private String address;
	private String email;
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		// TODO: Get current year then minus birth year
		return 0;
	}
	@Override
	public String toString() {
		return "Person [name=" + getName() + ", birthday=" + getBirthday() + ", address=" + getAddress()
				+ ", email=" + getEmail() + "]";
	}
	
	
}
