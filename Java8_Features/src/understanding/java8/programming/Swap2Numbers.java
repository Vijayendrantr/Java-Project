package understanding.java8.programming;

public class Swap2Numbers {
	
	public static void main(String[] args) {
		
		//Method 1
		int a = 30 , b=20;
		int temp;
		
		temp = b;
		b = a;
		a = temp;
		
		System.out.println("a = " + a + " b = " + b);
		
		//Method 2
		int x = 300 , y=200;
		int c = x + y;
		a = c-x;
		b = c-a;
		
		System.out.println("a = " + a + " b = " + b);
	}

}
