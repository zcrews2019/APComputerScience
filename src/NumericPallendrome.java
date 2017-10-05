import java.util.Scanner;

public class NumericPallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num;
		boolean pallindrome;

		while (true) {

			System.out.print("Please enter a 5-digit number: ");
			num = in.nextInt();
			pallindrome = isNumericPallindrome(num);

			if (pallindrome) {
				System.out.println("Numeric pallendrome!");
			} else {
				System.out.println("Not a numeric pallendrome.");
			}

		}

	}

	public static boolean isNumericPallindrome(int num) {
		int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, digit5 = 0;
		while (num % 10 != 0) {
			num--;
			digit5++;
		}

		while (num % 100 != 0) {
			num -= 10;
			digit4++;
		}

		while (num % 1000 != 0) {
			num -= 100;
			digit3++;
		}

		while (num % 10000 != 0) {
			num -= 1000;
			digit2++;
		}

		while (num != 0) {
			num -= 10000;
			digit1++;
		}

		if (digit1 == digit5) {
			if (digit2 == digit4) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
