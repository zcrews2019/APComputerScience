/*
 * If Statement Practice
 * Zach Crews
 * Uses if-statements to do various tasks, larger int and projects 4-1 to 4-3
 */
public class IfStatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Divison:");
		System.out.println(fullDivision(3,29));

		
		// calls method to get largest int
		int largest = largerInt(7,17);
		// prints out largest integer
		System.out.println(largest);
		
		
		//prints out cost for telephone call
		System.out.println(costCalculator(1));

	}

	public static int largerInt(int int1, int int2) {

		// checks for larger integer
		if (int1 > int2) {
			return int1;
		} else {
			return int2;
		}
	}
	
	public static String fullDivision(int num1, int num2){
		int quotient = quotient(num1, num2);
		int remainder = remainder(num1,num2);
		String line = quotient + "r. " + remainder + ".";
		return line;
	}
	
	public static int quotient(int num1, int num2){
		int quotient = Math.max(num1, num2) / Math.min(num1, num2);
		return quotient;
	}
	
	public static int remainder(int num1, int num2){
		int remainder = Math.max(num1, num2) % Math.min(num1, num2);
		return remainder;
	}
	
	public static double costCalculator(int minutes){
		double cost;
		
		if (minutes < 2){
			cost = 1.15;
			return cost;
		}
		
		minutes -= 2;
		cost = 1.15 + minutes * 0.5;
		return cost;
		//
	}

}
