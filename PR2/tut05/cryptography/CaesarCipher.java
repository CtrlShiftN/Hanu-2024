package tut05.cryptography;

/**
 * @author QuyenNv
 *
 */
public class CaesarCipher extends Cryptography {
	private int shiftNumber = 1;
	private final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public CaesarCipher() {
		super();
	}

	/**
	 * @param shiftNumber
	 */
	public CaesarCipher(int shiftNumber) {
		super();
		this.shiftNumber = shiftNumber;
	}

	/**
	 * @param plainText
	 */
	public CaesarCipher(String plainText) {
		super(plainText);
	}

	public CaesarCipher(String plainText, int shiftNumber) {
		super(plainText);
		this.shiftNumber = shiftNumber;
	}

	/**
	 * @param text
	 * @param isRaw
	 * @param shiftNumber
	 */
	public CaesarCipher(String text, boolean isRaw, int shiftNumber) {
		super(text, isRaw);
		this.shiftNumber = shiftNumber;
	}

	/**
	 * @return the shiftNumber
	 */
	public int getShiftNumber() {
		return shiftNumber;
	}

	/**
	 * @param shiftNumber the shiftNumber to set
	 */
	public void setShiftNumber(int shiftNumber) {
		this.shiftNumber = shiftNumber;
	}

	@Override
	public void encrypt() {
		String plainText = this.getPlainText();
		String cipherText = "";
		int shiftNumber = this.getShiftNumber();
		if (plainText == null || plainText.trim().isEmpty()) {
			System.err.println("Plain text is empty");
			System.exit(0);
		} else {
			for (int i = 0; i < plainText.length(); i++) {
				char singleChar = plainText.charAt(i);
				if (Character.isUpperCase(singleChar)) {
					int charPosition = UPPERCASE_ALPHABET.indexOf(singleChar);
					int keyVal = (shiftNumber + charPosition) % 26;
					char replaceVal = UPPERCASE_ALPHABET.charAt(keyVal);
					cipherText += replaceVal;
				} else {
					int charPosition = LOWERCASE_ALPHABET.indexOf(singleChar);
					int keyVal = (shiftNumber + charPosition) % 26;
					char replaceVal = LOWERCASE_ALPHABET.charAt(keyVal);
					cipherText += replaceVal;
				}
			}
			this.setCipherText(cipherText);
		}
	}

	@Override
	public void decrypt() {
		String plainText = "";
		String cipherText = this.getCipherText();
		int shiftNumber = this.getShiftNumber();
		if (cipherText == null || cipherText.trim().isEmpty()) {
			System.err.println("Cipher text is empty");
			System.exit(0);
		} else {
			for (int i = 0; i < cipherText.length(); i++) {
				char singleChar = cipherText.charAt(i);
				if (Character.isUpperCase(singleChar)) {
					int charPosition = UPPERCASE_ALPHABET.indexOf(singleChar);
					int keyVal = (charPosition - shiftNumber) % 26;
					if (keyVal < 0) {
						keyVal = UPPERCASE_ALPHABET.length() + keyVal;
					}
					char replaceVal = UPPERCASE_ALPHABET.charAt(keyVal);
					cipherText += replaceVal;
				} else {
					int charPosition = LOWERCASE_ALPHABET.indexOf(singleChar);
					int keyVal = (charPosition - shiftNumber) % 26;
					if (keyVal < 0) {
						keyVal = LOWERCASE_ALPHABET.length() + keyVal;
					}
					char replaceVal = LOWERCASE_ALPHABET.charAt(keyVal);
					cipherText += replaceVal;
				}
			}
			this.setCipherText(cipherText);
		}
	}

}
