package homeWork_1_2;

public class HomeWork_1_2 {

	public static void main(String[] args) {
		int i = 10000;
		perfNum(i);

	}

	private static void perfNum(int diap) {
		int tmp;
		for (int i = 2; i < diap; i++) {
			tmp = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					tmp += j;
				}
			}
			if (tmp == i) {
				System.out.println(i);

			}

		}
	}
}
