package tut01;

public class StarCharacterPrinter {
	public static void main(String[] args) {
		String[] characterA = { "       ****      ", "      **  **     ", "     **    **    ", "    **********   ",
				"   ************  ", "  **          ** ", " **            **", };
		String[] characterB = { "************  ", "**          **", "**          **", "**************",
				"**          **", "**          **", "************  ", };
		for (int i = 0; i < characterA.length; i++) {
			System.out.println(characterA[i] + "   " + characterB[i]);
		}
	}

}
