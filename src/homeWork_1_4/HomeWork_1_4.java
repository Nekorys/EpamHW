package homeWork_1_4;

import java.util.Arrays;

public class HomeWork_1_4 {

	public static void main(String[] args) {
		int size = 5;
		int[][] arr = new int[size][size];
		fillMx(arr);
		drawMx(arr);
		drawMx(matrTurn(arr));
	}

	private static void fillMx(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = arr.length * i + j + 1;
			}
		}
	}
	private static void drawMx(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	private static int[][] matrTurn(int[][] arr) {
		for (int i = 0; i < arr.length / 2; i++){
			for (int j = i; j < arr.length - 1 - i; j++){
				
				int tmp = arr[i][j];
				arr[i][j] = arr[j][arr.length - 1 - i];
				arr[j][arr.length - 1 - i] = arr[arr.length - 1 - i][arr.length - 1 - j];
				arr[arr.length - 1 - i][arr.length - 1 - j] = arr[arr.length - 1 - j][i];
				arr[arr.length - 1 - j][i] = tmp;
			}
		}

		return arr;

	}

}