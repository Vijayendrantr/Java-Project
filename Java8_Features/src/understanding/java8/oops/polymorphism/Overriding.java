package understanding.java8.oops.polymorphism;

public class Overriding {

	public static void main(String[] args) {
		
		Parent parent;
		parent = new SubClass1();
		parent.print();
		
		parent = new SubClass2();
		parent.print();
	}
}

class Parent {
	
	void print(){
		System.out.println("Parent");
	}
}

class SubClass1 extends Parent {
	
	void print(){
		System.out.println("Subclass 1");
	}
}

class SubClass2 extends Parent {
	
	void print(){
		System.out.println("Subclass 2");
	}
}
