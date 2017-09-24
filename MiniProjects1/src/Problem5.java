/*
 * Problem 5
 * Zach Crews
 * Prints a text image to the console
 */
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calls method to print text image
		printImage();

	}

	public static void line() {
		// prints a line made up of 5 dots
		System.out.println("*****");
	}

	public static void twoDots() {
		// prints 2 dots
		System.out.println(" * * ");
	}

	public static void oneDot() {
		// prints one dot
		System.out.println("  *  ");
	}

	public static void blank() {
		// gives blank line
		System.out.println();
	}

	public static void doubleLine() {
		// prints 2 lines
		line();
		line();
	}

	public static void starShape() {
		// prints a star shape to reduce redundancy
		twoDots();
		oneDot();
		twoDots();
	}

	public static void printImage() {

		// calls a series of methods to print out individual lines
		doubleLine();
		starShape();
		blank();
		doubleLine();
		starShape();
		doubleLine();
		blank();
		oneDot();
		oneDot();
		oneDot();
		doubleLine();
		starShape();
	}

}
