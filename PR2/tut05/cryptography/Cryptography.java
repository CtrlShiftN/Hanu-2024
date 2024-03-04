package tut05.cryptography;

public class Cryptography {
	private String plainText;
	private String cipherText;
	private boolean isRaw = true;

	public Cryptography() {
	}

	public Cryptography(String text) {
		if (this.isRaw) {
			this.plainText = text;
		} else {
			this.cipherText = text;
		}
	}

	public Cryptography(String text, boolean isRaw) {
		if (isRaw) {
			this.plainText = text;
		} else {
			this.cipherText = text;
		}
	}

	/**
	 * @return the plainText
	 */
	public String getPlainText() {
		return this.plainText;
	}

	/**
	 * @param plainText the plainText to set
	 */
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	/**
	 * @return the cipherText
	 */
	public String getCipherText() {
		return this.cipherText;
	}

	/**
	 * @param cipherText the cipherText to set
	 */
	public void setCipherText(String cipherText) {
		this.cipherText = cipherText;
	}

	public void encrypt() {
		this.setCipherText(null);
	}

	public void decrypt() {
		this.setPlainText(null);
	}

}
