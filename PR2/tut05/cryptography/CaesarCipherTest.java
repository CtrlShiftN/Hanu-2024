package tut05.cryptography;

public class CaesarCipherTest {

	public static void main(String[] args) {
		CaesarCipher c = new CaesarCipher("aBc", 3);
		c.encrypt();
		System.out.println(c.getCipherText()); // dEf
		c.setCipherText("dEf");
		System.out.println(c.getPlainText()); // aBc
	}

}
