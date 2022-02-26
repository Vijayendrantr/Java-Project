package understanding.java8.multithreading;

public class ThreadPool {
	
	public static void main(String[] args) {
		
		//FixedThreadPool --> Thread Safe --> Blocking Queue
		//CachedThreadPool --> Synchronous queue --> No threads argument --> Creates thread depends on the task
		//ScheduledThreadPool --> DelayedWorkQueue --> After a certain delay
					// Service.schedule
					// Service.scheduleAtFixedRate
					// Service.scheduleAtFixedDelay
		//SingleThreadedExector --> Size of the pool is only 1 --> Blocking Queue
	}

}
