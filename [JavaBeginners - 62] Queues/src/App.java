import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class App {

	public static void main(String[] args) {
		// (head) <- ooooooooooooooooooo <- (tail) fi-fo
		
		// fixed size, instead of linked list (infinite size)
		Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
		
		// throws nosuchelement exception, no items in queue yet
		//System.out.println("Head of queue is: " + q1.element());
		
		q1.add(10);
		q1.add(9);
		q1.add(8);
		
		System.out.println("Head of queue is: " + q1.element());
		
		// unchecked/runtime exception
		try {
			q1.add(7);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue.");
		}
		
		for(Integer value: q1) {
			System.out.println("Queue value: " + value);
		}
		
		// removes head of queue and returns it
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		
		try {
			System.out.println("Removed from queue: " + q1.remove());
		}  catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from queue.");
		}

		/*******************************/
		Queue<Integer> q2 = new ArrayBlockingQueue<>(2);
		
		System.out.println("Queue 2 peek: " + q2.peek());
		
		// just like add, but doesn't throw exception when fails, just false
		q2.offer(10);
		q2.offer(20);
		
		if(q2.offer(30) == false) {
			System.out.println("Offer failed to add third item.");
		}
		
		System.out.println("Queue 2 peek: " + q2.peek());
		
		for(Integer value: q2) {
			System.out.println("Queue 2 value: " + value);
		}
		
		// just like remove, but returns null instead of an exception
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
	}

}
