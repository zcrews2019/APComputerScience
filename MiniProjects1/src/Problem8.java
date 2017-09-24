
/*
 * Problem 8
 * Zach Crews
 * outputs diameter, circumference, surface area, and volume of a sphere
 */
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates Scanner to handle user input
		Scanner in = new Scanner(System.in);

		// asks user to input radius of sphere and stores data as double
		System.out.print("Please enter the sphere's radius: ");
		double radius = in.nextDouble();

		// calculates and prints diameter
		double diameter = radius * 2;
		System.out.println("\nThe sphere's diameter is " + diameter);

		// calculates and prints circumference
		double circumference = 3.14 * diameter;
		System.out.println("The sphere's circumference is " + circumference);

		// calculates and prints surface area
		double surfaceArea = 4.0 * 3.14 * radius * radius;
		System.out.println("The sphere's surface area is " + surfaceArea);

		// calculates and prints volume
		double volume = 4.0 / 3.0 * 3.14 * radius * radius * radius;
		System.out.println("The sphere's volume is " + volume);

	}

}
