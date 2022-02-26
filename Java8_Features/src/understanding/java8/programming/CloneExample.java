package understanding.java8.programming;

public class CloneExample {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A(10, "Vijay");
		A b = (A)a.clone();
		System.out.println(b.i);
        System.out.println(b.s);
	}
}

class A implements Cloneable {
	
	int i;
	String s;
	
	public A(int i, String s) {
		this.i=i;
		this.s=s;
	}
	
	// Overriding clone() method by simply calling Object class clone() method.
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}