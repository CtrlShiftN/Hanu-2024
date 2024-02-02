package tut03;

import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private double discount;

	/**
	 * 
	 */
	public Product() {
		super();
	}

	/**
	 * @param name
	 * @param price
	 * @param discount
	 */
	public Product(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	/**
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.discount = 0;
	}

	public double calculateImportTax() {
		return this.price * 0.1;
	}

	public void promtDetails() {
		this.name = promtName();
		this.price = promtPrice();
		this.discount = promtDiscount();
	}

	public void displayDetails() {
		System.out.println(
				"Product: [" + "name: " + this.name 
				+ ", price: " + this.price + ", discount: " 
				+ this.discount +", tax: "+ this.calculateImportTax() + "]");
	}

	private double promtDiscount() {
		Scanner sc = new Scanner(System.in);
		double discount;
		do {
			System.out.println("Enter product discount: ");
			while (!sc.hasNextDouble()) {
				System.out.println("Invalid discount. Please enter a number.");
				sc.nextLine();
			}
			discount = sc.nextDouble();
			if (discount < 0 || discount > 100) {
				System.out.println("Discount must be a number between [0.0 - 100.0].");
			}
		} while (discount < 0 || discount > 100);
		return discount;
	}

	private double promtPrice() {
		Scanner sc = new Scanner(System.in);
		double price;
		do {
			System.out.println("Enter product price: ");
			while (!sc.hasNextDouble()) {
				System.out.println("Invalid price. Please enter a number.");
				sc.nextLine();
			}
			price = sc.nextDouble();
			if (price < 0) {
				System.out.println("Price must be greater than or equal to 0.");
			}
		} while (price < 0);
		return price;
	}

	private String promtName() {
		Scanner sc = new Scanner(System.in);
		boolean gotIt = false;
		System.out.println("Enter product name: ");
		String productName = sc.nextLine();
		while (!gotIt) {
			if (isInvalidName(productName)) {
				System.out.println("Invalid name. Please re-enter product name:");
				productName = sc.nextLine();
			} else {
				gotIt = true;
			}
		}
		return productName;
	}

	private boolean isInvalidName(String name) {
		return name.matches(".*\\d.*");
	}

}
