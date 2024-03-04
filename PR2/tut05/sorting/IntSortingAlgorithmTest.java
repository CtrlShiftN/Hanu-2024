package tut05.sorting;

public class IntSortingAlgorithmTest {

	public static void main(String[] args) {
		IntSortingAlgorithm test = new IntSortingAlgorithm("algorithmTest");
		System.out.println(test.toString());
		BubbleSort bs = new BubbleSort("Bubble Sort");
		System.out.println(bs.toString());
		int[] array = { 6, 1, 3, 5, 2, 4 };
		int[] sortedArray = { 1, 2, 3, 4, 5 };
		BubbleSort bs1 = new BubbleSort("Bubble", array);
		if (bs1.isSorted()) {
			System.out.println(bs1.getName() + " Sorted!");
		} else {
			bs1.sort();
			System.out.println(bs1.toString());
		}
	}

}
