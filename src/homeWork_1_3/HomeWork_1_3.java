package homeWork_1_3;

import java.util.Arrays;

public class HomeWork_1_3 {

	public static void main(String[] args) {
		drawMx(fill(creation(10)));
	}

	private static int[][] creation(int hight) {

		int arr[][] = new int[hight][];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[k];
			k += 2;
		}
		return arr;
	}

	private static int[][] fill(int[][] arr) {
		int num;
		for (int i = arr.length - 1; i >= 0; i--) {
			num = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (j <= arr[i].length / 2) {
					arr[i][j] = ++num;
				} else {
					arr[i][j] = --num;
				}
			}
		}
		return arr;
	}

	private static void drawMx(int[][] cs) {
		for (int i = 0; i < cs.length; i++) {
			System.out.println(Arrays.toString(cs[i]));
		}
	}

}
