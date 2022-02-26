package understanding.java8.programming;

public class FibonacciSeries {
	
	static int x1=0,x2=1,x3=0;    

	public static void main(String[] args) {
		
		withoutRecursion();
		withRecursion();
	}

	private static void withRecursion() {
		 int count=10;    
		  System.out.print(x1+" "+x2);//printing 0 and 1    
		  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	}

	private static void withoutRecursion() {
		
		int count = 10;
		int n1 = 0, n2 = 1;
		int n3,i;
		
		System.out.print(n1 + " " + n2);// printing 0 and 1
		
		//without recursion
		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	static void printFibonacci(int count){
	    if(count>0){    
	         x3 = x1 + x2;    
	         x1 = x2;    
	         x2 = x3;    
	         System.out.print(" "+x3);   
	         printFibonacci(count-1);    
	     }
	 }    
}