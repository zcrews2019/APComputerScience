/*
 * Problem 3
 * Zach Crews
 * Prints text image
 */
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calls printBoxes method
		printBoxes();

	}

	public static void slashes() {

		// prints slashes line
		System.out.println("//////////////////////");
	}

	public static void victoryIsMine() {

		// prints victory is mine line
		System.out.println("|| Victory is mine! ||");
	}

	public static void printBoxes() {

		// calls methods to print out image
		slashes();
		victoryIsMine();
		slashes();
		victoryIsMine();
		slashes();
		victoryIsMine();
		slashes();
		victoryIsMine();
		slashes();
		victoryIsMine();
		slashes();
	}

}
