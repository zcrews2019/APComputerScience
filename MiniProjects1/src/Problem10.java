
/*
 * Problem 10
 * Zach Crews
 * Determines how much you should weigh
 */
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates Scanner data type to process user input
		Scanner in = new Scanner(System.in);

		// asks user for their height and stores it to integer data type
		System.out.print("Please enter a height in inches: ");
		int inches = in.nextInt();

		// prints out a blank line
		System.out.println();

		// calculates recommended weight for males and females and stores data as integers
		int maleWeight = 106 + 7 * (inches - 60);
		int femaleWeight = 100 + 6 * (inches - 60);

		// prints out recommended weights
		System.out.println("Recommended Male Weight: " + maleWeight);
		System.out.println("Recommended Female Weight: " + femaleWeight);

	}

}
