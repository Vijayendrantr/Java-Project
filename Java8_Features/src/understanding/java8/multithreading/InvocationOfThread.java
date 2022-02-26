package understanding.java8.multithreading;

public class InvocationOfThread {
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		myThread.start();
		
		myThread.run();
		myThread.run();
		
		myThread.start();
	}
}