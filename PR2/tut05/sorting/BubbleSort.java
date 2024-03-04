package tut05.sorting;

public class BubbleSort extends IntSortingAlgorithm{
	private String name = "Bubble Sort";
	
	public BubbleSort(String name) {
		super(name);
	}
	
	public BubbleSort(String name, int[] array) {
		super(name, array);
	}
	
	@Override
	public void sort() {
		int[] intArr = this.getArray();
		for (int i = 0; i < intArr.length - 1; i++) {
			for (int j = 0; j < intArr.length - i - 1; j++) {
				if (intArr[j] > intArr[j+1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
				}
			}
		}
		super.setSortedArray(intArr);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
