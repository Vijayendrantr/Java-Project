package understanding.java8.oops.abstraction;

public class Salary extends Employee{
	
	private double salary;
	
	public Salary(String empName, String empAddress, int empId, double salary) {
	      super(empName, empAddress, empId);
	      setSalary(salary);
	   }
	public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getEmpName() + " with salary " + salary);
	   }
	 
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	   
	   public double computePay() {
	      System.out.println("Computing salary pay for " + getEmpName());
	      return salary/52;
	   }
}
