package tut03;

public class Products {
	// attrs
	private String name;
	private double price;
	private double discount;

	// constructors
	public Products() {
	}

	public Products(String name) {
		this.name = name;
	}

	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Products(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	// getters & setters (validation)
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setName(String newName) throws Exception {
		if (!isInvalidName(newName)) {
			this.name = newName;
		} else {
			throw new Exception("Invalid name: " + newName);
		}
	}

	public void setPrice(double newPrice) throws Exception {
		if (isValidPrice(newPrice)) {
			this.price = newPrice;
		} else {
			throw new Exception("Invalid price: " + newPrice);
		}
	}

	private boolean isValidPrice(double price) {
		return price >= 0;
	}

//	public boolean setName(String newName) {
//		if(!isInvalidName(newName)) {
//			this.name = newName;
//			return true;
//		}else {
//			return false;
//		}
//	}

	// validation
	private boolean isInvalidName(String name) {
		return name.matches(".*\\d.*");
	}

	// methods
	public double calculateImportTax() {
		return this.price * 0.1;
	}

	public void displayDetails() {
		// Method 01: using toString
//		System.out.println(this.toString());
		// Method 02: custom display
		System.out.println("Product name: " + this.getName());
		// TODO: print the rest
	}

	public void promtDetails() {
		// TODO: implement necessary methods
		this.name = promtName();
		this.price = promtPrice();
		this.discount = promtDiscount();
	}

	private String promtName() {
		// TODO
		// Get data from user input
		// validate data
		// re-enter if not valid
		return null;
	}

	private double promtPrice() {
		// TODO
		// Get data from user input
		// validate data
		// re-enter if not valid
		return 0.0;
	}
	private double promtDiscount() {
		// TODO
		// Get data from user input
		// validate data
		// re-enter if not valid
		return 0.0;
	}

	// toString()
	@Override
	public String toString() {
		return "Products [name=" + this.getName() + ", price=" + this.getPrice() + ", discount=" + this.getDiscount()
				+ ", importTax=" + this.calculateImportTax() + "]";
	}
}
