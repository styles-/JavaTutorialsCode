public class App {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runner("One"));
		Thread t2 = new Thread(new Runner("Two"));
		Thread t3 = new Thread(new Runner("Three"));
		Thread t4 = new Thread(new Runner("Four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
