import java.util.Random;

public class Runner implements Runnable {
	private String name;
	private int time;
	private Random ran = new Random();

	public Runner(String name) {
		this.name = name;
		this.time = ran.nextInt(999);
	}

	@Override
	public void run() {
		System.out.println(name + " is sleeping for " + time + " (ms)");
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " is finished.");
	}

}
