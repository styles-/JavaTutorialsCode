import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Semaphore sem = new Semaphore(1); //object that maintains a count,
		 * count: # of available permits // semaphore w/ 1 permit is essentially
		 * a lock // use to control access to a resource
		 * 
		 * sem.release(); sem.acquire();
		 * 
		 * System.out.println("Available permits: " + sem.availablePermits());
		 */
		ExecutorService executor = Executors.newCachedThreadPool();

		for (int i = 0; i < 200; i++) {
			executor.submit(new Runnable() {

				@Override
				public void run() {
					Connection.getInstance().connect();
				}

			});
		}
		
		executor.shutdown();
		
		executor.awaitTermination(1, TimeUnit.DAYS);
	}

}
