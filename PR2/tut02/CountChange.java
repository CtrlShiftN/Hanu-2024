package tut02;

import java.util.Scanner;

public class CountChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many quaters do you have?");
		int quater = sc.nextInt();
		System.out.println("How many dimes do you have?");
		int dime = sc.nextInt();
		System.out.println("How many nickels do you have?");
		int nickel = sc.nextInt();
		System.out.println("How many pennies do you have?");
		int penny = sc.nextInt();
		int cent = penny + nickel * 5 + dime * 10 + quater * 25;
//		System.out.println("Cent: " + cent);
		double dollar = (double) cent / 100;
		System.out.println("You have: $" + dollar);
	}

}
