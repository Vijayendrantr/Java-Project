package understanding.java8.oops.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {

		Salary salary = new Salary("Vijay", "Pallikaranai", 2103420, 1.5);
		Employee employee = new Salary("John Adams", "Boston, MA", 2, 2400.00);
		System.out.println("Call mailCheck using Salary reference --");
		salary.mailCheck();
		System.out.println("Call mailCheck using Employee reference--");
		employee.mailCheck();
	}
}
