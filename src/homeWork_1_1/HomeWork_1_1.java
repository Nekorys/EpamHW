package homeWork_1_1;

import java.util.Scanner;

public class HomeWork_1_1 {

	public static void main(String[] args) {
		for (char ans : from10to()) {
			System.out.print(ans);
		}
	}

	private static char[] from10to() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number in the dec system");
		int number = in.nextInt();
		System.out.println("Enter the number system");
		int system = in.nextInt();
		System.out.println("Enter the number of digits");
		int bitCap = in.nextInt();
		char[] result = new char[bitCap];
		for (int i = result.length - 1; i >= 0; i--) {
			result[i] = (char) (number % system);
			number = number / system;

		}
		return outPut(result);
	}
	
	private static char[] outPut(char[] result) {
		for (int i = 0; i < result.length; i++) {

			switch (result[i]) {
			case 0:
				result[i] = '0';
				break;
			case 1:
				result[i] = '1';
				break;
			case 2:
				result[i] = '2';
				break;
			case 3:
				result[i] = '3';
				break;
			case 4:
				result[i] = '4';
				break;
			case 5:
				result[i] = '5';
				break;
			case 6:
				result[i] = '6';
				break;
			case 7:
				result[i] = '7';
				break;
			case 8:
				result[i] = '8';
				break;
			case 9:
				result[i] = '9';
				break;
			case 10:
				result[i] = 'A';
				break;
			case 11:
				result[i] = 'B';
				break;
			case 12:
				result[i] = 'C';
				break;
			case 13:
				result[i] = 'D';
				break;
			case 14:
				result[i] = 'E';
				break;
			case 15:
				result[i] = 'F';
				break;

			default:
				break;
			}

		}
		return result;
	}

}
