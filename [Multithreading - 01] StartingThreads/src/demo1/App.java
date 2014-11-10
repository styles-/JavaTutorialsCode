package demo1;

//extend thread class
//implement runnable

class Runner extends Thread {

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class App {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		// don't call run(), start() looks for run() and puts it in a special thread
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
		
		
	}

}
