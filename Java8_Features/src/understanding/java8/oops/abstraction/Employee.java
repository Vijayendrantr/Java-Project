package understanding.java8.oops.abstraction;

public abstract class Employee {
	
	private String empName;
	private int	empId;
	private String empAddress;
	
	public Employee(String empName, String empAddress, int empId) {
		super();
		System.out.println("Constructing an Employee");
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public void mailCheck(){
		System.out.println("Inside Employee mail check method");
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAddress=" + empAddress + "]";
	}
	
	
}
