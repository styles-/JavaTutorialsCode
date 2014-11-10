import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		
		System.out.println("Waiting ...");
		cond.await(); // after secondThread cond.signal()
		
		System.out.println("Woken up!");
		
		// bad practice if this throws an exception, unlock will never be called
		/*increment();
		 *lock.unlock();  
		 */
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void secondThread() throws InterruptedException {
		Thread.sleep(1000); // wait in signal demo
		lock.lock();
		
		System.out.println("Press the return key!");
		new Scanner(System.in).nextLine();
		System.out.println("Got the return key!");
		
		cond.signal(); // wakes up waiting thread
		
		try {
			increment();
		} finally {
			lock.unlock(); // must unlock after cond.signal(), else the other thread won't get the lock
		}
	}

	public void finished() {
		System.out.println("Count is: " + count);
	}
}
