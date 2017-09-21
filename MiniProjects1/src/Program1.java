/*
 * Project 1
 * Zach Crews
 * Prints "Victory is mine!"
 */

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calls method to print full box
		fullBox();

	}

	public static void slashes() {

		// prints line with all slashes
		System.out.println("//////////////////////");

	}

	public static void victoryIsMine() {

		// prints "Victory is mine!" line
		System.out.println("|| Victory is mine! ||");
	}

	public static void fullBox() {

		// calls slashes method
		slashes();

		// calls victoryIsMine method
		victoryIsMine();

		// calls slashes method
		slashes();
	}

}
