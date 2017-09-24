/*
 * Problem 4
 * Zach Crews
 * prints text image to the console
 */
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fullTriangle();
		box();
		helloWorld();
		box();
		fullTriangle();

	}
	
	public static void topTriangle() {
		System.out.println("   /\\   ");
	}
	
	public static void midTriangle() {
		System.out.println("  /  \\  ");
	}
	
	public static void bottomTriangle() {
		System.out.println(" /    \\ ");
	}
	
	public static void fullTriangle() {
		topTriangle();
		midTriangle();
		bottomTriangle();
	}
	
	public static void box() {
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	
	public static void helloWorld() {
		System.out.println("|Hello |");
		System.out.println("| World|");
	}

}
