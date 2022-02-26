package understanding.java8.oops;

public class Inheritance extends Calculation {
	
	public static int multiplication(int a , int b) {
		int z = a * b;
		return z;
	}
	
	public static void main(String[] args) {
		
		int a = 30, b = 20;
		int add, subtract, multiply;
		Inheritance inheritance = new Inheritance();
		add = inheritance.addition(a, b);
		subtract = inheritance.subtraction(a, b);
		multiply = multiplication(a,b);
		System.out.println("Addition = " + add);
		System.out.println("Subtraction = " + subtract);
		System.out.println("Multiplication = " + multiply);
	}
}

class Calculation {
	
	public int addition(int a , int b) {
		int z = a + b;
		return z;
	}
	
	public int subtraction(int a , int b) {
		int z = a - b;
		return z;
	}
}

