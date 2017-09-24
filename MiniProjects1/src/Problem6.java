/*
 * Problem 6
 * Zach Crews
 * Prints text image to console
 */
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calls method to print image
		printImage();

	}

	public static void shortLine() {
		// prints short line
		System.out.println("    *****    ");
	}

	public static void mediumLine() {
		// prints medium sized line
		System.out.println("  *********  ");
	}

	public static void longLine() {
		// prints long line
		System.out.println("*************");
	}

	public static void bars() {
		// prints line of bars
		System.out.println("* | | | | | *");
	}

	public static void pyramidShape() {
		// prints out a pyramid shape
		shortLine();
		mediumLine();
		longLine();
	}

	public static void printImage() {

		// calls a series of methods to print out individual lines of the image
		pyramidShape();
		System.out.println();
		pyramidShape();
		bars();
		longLine();
		pyramidShape();
		System.out.println();
		pyramidShape();
		shortLine();
		bars();
		bars();
		shortLine();
		shortLine();
	}
}
