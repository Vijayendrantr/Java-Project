package understanding.java8.programming;

public class Factorial {

	public static void main(String args[]) {
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		
		int factNum = factorial(fact,number);
		System.out.println("Factorial of " + number + " is: " + factNum);
	}
	
	public static int factorial(int fact, int number) {
		
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
