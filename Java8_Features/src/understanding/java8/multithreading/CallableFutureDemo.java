package understanding.java8.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		for(int i=0;i<10;i++) {
			Future<Integer> future = executorService.submit(new TaskExample());
			int result = future.get();
			System.out.println("Result : " + result);
		}
	}
}

class TaskExample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}
}