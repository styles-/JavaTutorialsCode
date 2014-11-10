
public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner("One"));
		Thread t2 = new Thread(new Runner("Two"));
		Thread t3 = new Thread(new Runner("Three"));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
