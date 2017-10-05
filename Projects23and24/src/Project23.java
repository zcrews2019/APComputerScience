import java.util.Scanner;abstract

// Project 2-3
public class Project23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates scanner to control and take in user input
		Scanner in = new Scanner(System.in);

		// asks user how many kilometers they want to convert
		System.out.print("How many kilometers would you like to convert?\t");

		// takes user input and stores it to kilometers (data type = double)
		double kilometers = in.nextDouble();

		// closes Scanner
		in.close();

		// calculates nautical miles, converts to them from kilometers
		double nauticalMiles = ((kilometers / 10000) * 90) * 60;

		// prints the answer in nautical miles
		System.out.println("That is " + nauticalMiles + " nautical miles.");

	}

}
