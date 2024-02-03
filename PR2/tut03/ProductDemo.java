package tut03;

public class ProductDemo {
	private String name;
	private double price;
	private double discount;
	
	public ProductDemo() {}
	
	public ProductDemo(String name) {
		this.name = name;
	}
	
	public ProductDemo(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * 
	 * @param name
	 * @param price
	 * @param discount
	 */
	public ProductDemo(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public String getName() {
		return this.name;
	}
	
//	public void setName(String newName) throws Exception {
//		if(!isInvalidName(newName)) {
//			this.name = newName;
//		}else {
//			throw new Exception("Invalid name: "+ newName);
//		}
//	}
	
	public boolean setName(String newName) {
		if(!isInvalidName(newName)) {
			this.name = newName;
			return true;
		}else {
			return false;
		}
	}

	private boolean isInvalidName(String name) {
		return name.matches(".*\\d.*");
	}
	
	public void promtDetails() {
		this.name = promtName();
		// TODO
	}

	public String promtName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "ProductDemo [name=" + this.getName() + ", price=" + this.price + ", discount=" + discount + "]";
	}
	
	
	
}
