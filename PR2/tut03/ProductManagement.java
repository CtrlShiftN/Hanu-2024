package tut03;

public class ProductManagement {

	public static void main(String[] args) {
		System.out.println("Product 01");
		Product book = new Product();
		book.promtDetails();
		book.displayDetails();
		System.out.println("Product 02");
		Product pen = new Product();
		pen.promtDetails();
		pen.displayDetails();
	}

}
