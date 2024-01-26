package tut02;

public class PairRoll {

	public static void main(String[] args) {
		int firstRoll = (int) (Math.random() * 6) + 1;
		System.out.println("The first die comes up " + firstRoll);
		int secondRoll = (int) (Math.random() * 6) + 1;
		System.out.println("The second die comes up " + secondRoll);
		System.out.println("Your total roll is " + (firstRoll + secondRoll));
	}

}
