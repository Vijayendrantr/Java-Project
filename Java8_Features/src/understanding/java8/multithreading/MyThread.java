package understanding.java8.multithreading;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread Name :" + Thread.currentThread().getName());
		System.out.println("run() method called");
	}
}