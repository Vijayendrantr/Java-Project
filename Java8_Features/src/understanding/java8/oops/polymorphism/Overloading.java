package understanding.java8.oops.polymorphism;

public class Overloading {
	
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		System.out.println(calculation.add(10, 20));
		System.out.println(calculation.add(10.5, 20.57, 30.33));
	}
}

class Calculation {
	
	public int add(int a , int b) {
		int total = a+b;
		return total;
	}

	public double add(double a , double b, double c) {
		double total = a+b+c;
		return total;
	}
}
