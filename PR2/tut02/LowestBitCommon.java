package tut02;

public class LowestBitCommon {

	public static void main(String[] args) {
		long firstNumber = 18;
		long secondNumber = 25;
		String firstBit = longToBinary(firstNumber);
		String secondBit = longToBinary(secondNumber);
		System.out.println("1st bit: " + firstBit);
		System.out.println("2nd bit: " + secondBit);
		int lowestCommon = lowestCommon(firstNumber, secondNumber);
		System.out.println("Lowest common of " + firstNumber + " and " + secondNumber + " is: " + lowestCommon);
	}

	public static int lowestCommon(long firstNumber, long secondNumber) {
		int result = -1;
		// convert long to binary String
		String firstBit = longToBinary(firstNumber);
		String secondBit = longToBinary(secondNumber);
		// convert binary String to long number
		long firstBinary = Long.parseLong(firstBit);
		long secondBinary = Long.parseLong(secondBit);
		// make sure firstBinary always smallest
		if (firstBinary > secondBinary) {
			long temp = secondBinary;
			secondBinary = firstBinary;
			firstBinary = temp;
		}
//		System.out.println("F = " + firstBinary +", S = " + secondBinary);
		int count = 0;
		while (firstBinary > 0) {
			// get last digit
			int firstBinUnit = (int) firstBinary % 10;
			int secondBinUnit = (int) secondBinary % 10;
			// compare last digits
			if (firstBinUnit == secondBinUnit) {
				result = count;
				break;
			}
			// next digit
			firstBinary /= 10;
			secondBinary /= 10;
			count++;
		}
		
		return result;
	}

	public static String longToBinary(long number) {
		String binary = "";
		while (number > 0) {
			long remainder = number % 2;
			binary = remainder + binary;
			number /= 2;
		}
		return binary;
	}
}
