package tut05.sorting;

import java.util.Arrays;

public class IntSortingAlgorithm {
	private String name;
	private int[] array;
	private int[] sortedArray;
	
	public IntSortingAlgorithm() {
		
	}

	public IntSortingAlgorithm(String name) {
		this.name = name;
	}

	public IntSortingAlgorithm(int[] array) {
		this.array = array;
	}

	public IntSortingAlgorithm(String name, int[] array) {
		this.name = name;
		this.array = array;
	}

	/**
	 * @return the array
	 */
	public int[] getArray() {
		return this.array;
	}

	/**
	 * @param array the array to set
	 */
	public void setArray(int[] array) {
		this.array = array;
	}

	/**
	 * @return the sortedArray
	 */
	public int[] getSortedArray() {
		return this.sortedArray;
	}

	/**
	 * @param sortedArray the sortedArray to set
	 */
	public void setSortedArray(int[] sortedArray) {
		this.sortedArray = sortedArray;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	public void sort() {

	}

	public boolean isSorted() {
		boolean isSorted = true;
		int[] checkingArray = this.getArray();
		for (int i = 0; i < checkingArray.length - 1; i++) {
			if (checkingArray[i] > checkingArray[i + 1]) {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}

	public String toString() {
		return this.getName() + ": " + Arrays.toString(this.getSortedArray());
	}

}
