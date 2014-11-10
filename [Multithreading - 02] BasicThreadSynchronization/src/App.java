import java.util.Scanner;

class Processor extends Thread {

	// to keep Java from optimizing code where it won't change running
	// volatile: prevent threads caching variables when they're not changed within that thread
	// make variables volatile if you want to change them in other threads
	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("Hello");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
}

public class App {

	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press return to stop ...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
		
		scanner.close();
	}

}
