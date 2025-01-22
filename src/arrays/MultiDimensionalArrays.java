package arrays;

public class MultiDimensionalArrays {
	public static void main(String[] args) {

		int[][] arr = new int[3][4]; // 2D array
		// In memory, it is still stored as contiguous blocks
		// arr stores the address of first array of all ARRAYS

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <  4; j++) {
				arr[i][j] = i + j;
			}
		}
		for (int[] array : arr) {
			for (int i : array) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();

		// another way of initializing
		int[][] marks = {
				{2, 3, 4, 5},
				{6, 7, 8, 9},
				{10, 11, 12, 13}
		};
		for (int[] array : marks) {
			for (int i : array) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// 3D array
		int [][][] arr3d = new int[10][10][10];
	}
}
