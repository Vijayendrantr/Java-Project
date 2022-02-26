package understanding.java8.oops;

/*To achieve encapsulation in Java 

Declare the variables of a class as private.

Provide public setter and getter methods to modify and view the variables values.*/

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("vijay");
		e.setAge(32);
		e.setIdNum("1");
		
		System.out.println("Name : " + e.getName() + 
				"\nAge : " + e.getAge() + 
				"\nId : " + e.getIdNum());
	}
}

class Employee {
	private String name;
	   private String idNum;
	   private int age;

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getIdNum() {
	      return idNum;
	   }

	   public void setAge( int newAge) {
	      age = newAge;
	   }

	   public void setName(String newName) {
	      name = newName;
	   }

	   public void setIdNum( String newId) {
	      idNum = newId;
	   }
}
