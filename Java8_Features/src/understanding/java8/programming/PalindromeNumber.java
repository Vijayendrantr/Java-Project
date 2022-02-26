package understanding.java8.programming;

public class PalindromeNumber {

	public static void main(String[] args) {

		int lastDigit, sum = 0, a;
		int inputNumber = 77; // It is the number to be checked for palindrome

		a = inputNumber;

		// Code to reverse a number
		while (a > 0) {
			System.out.println("Input Number " + a);
			lastDigit = a % 10; // getting remainder
			System.out.println("Last Digit " + lastDigit);
			System.out.println("Digit " + lastDigit + " was added to sum " + (sum * 10));
			sum = (sum * 10) + lastDigit;
			System.out.println("Sum = " + sum );
			a = a / 10;
			System.out.println("a = " + a );
		}

		// if given number equal to sum than number is palindrome otherwise not
		// palindrome
		if (sum == inputNumber)
			System.out.println("Number is palindrome ");
		else
			System.out.println("Number is not palindrome");
	}
}