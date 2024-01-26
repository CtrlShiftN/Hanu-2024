package tut02;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }};
		printMatrix(matrix);
		System.out.println();
		int[][] transposedMatrix = tranposeMatrix(matrix);
		printMatrix(transposedMatrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " - ");
			}
			System.out.println();
		}
	}

	public static int[][] tranposeMatrix(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] transposedMatrix = new int[col][row];
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				transposedMatrix[i][j] = matrix[j][i];
			}
		}
		return transposedMatrix;
	}

}
