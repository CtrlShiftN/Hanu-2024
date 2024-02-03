package tut03;

public class ProductsTest {

	public static void main(String[] args) throws Exception {
		Products book = new Products("Harry Porter");
		book.setPrice(-1);
		book.displayDetails();
		Products book2 = new Products("Harry Porter");
		book2.setPrice(-1);
		book2.displayDetails();
		
		ProductDemo pen = new ProductDemo("Pen");
		boolean isSetName;
		do {
			String newName = pen.promtName();
			isSetName = pen.setName(newName);
		} while (!isSetName);

	}

}
