package understanding.java8.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadBasic {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Task());
		thread.start();
		System.out.println("Main Method : " + Thread.currentThread().getName());
		
		for(int i=0; i<10; i++) {
			Thread t1 = new Thread(new Task1());
			t1.start();
		}
		System.out.println("Main Method Loop : " + Thread.currentThread().getName());
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		for(int j=0; j<5; j++) {
			executorService.execute(new Task2());
		}
		
		System.out.println("Executor Service : " + Thread.currentThread().getName());
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Task Class : " + Thread.currentThread().getName());
	}
}

class Task1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task1 Class" + Thread.currentThread().getName());
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Class" + Thread.currentThread().getName());
	}
}
