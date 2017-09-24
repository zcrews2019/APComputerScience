
/*
 * Problem 9
 * Zach Crews
 * Calculates the area of a trapezoid
 */
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates Scanner to process user input
		Scanner in = new Scanner(System.in);

		System.out.println("Area of a Trapezoid Calculator");

		// asks user for measurements of trapezoid and stores data as doubles
		System.out.print("Enter the height of the trapezoid: ");
		double height = in.nextDouble();
		System.out.print("Enter the length of the top base: ");
		double topLength = in.nextDouble();
		System.out.print("Enter the length of the bottom base: ");
		double bottomLength = in.nextDouble();

		// calculates and prints area
		double area = (0.5) * (topLength + bottomLength) * height;
		System.out.println("The area is: " + area);

	}

}
