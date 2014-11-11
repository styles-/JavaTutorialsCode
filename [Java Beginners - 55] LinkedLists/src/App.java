import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		// rules to use each type:
		// ArrayList: add/remove at the end of the list
		// LinkedList: add/remove items anywhere else
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		// add items at end of list
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		*/
		
		/*
		// Add items elsewhere in list
		for(int i=0; i<1E5; i++) {
			list.add(0,i);
		}
		*/
		
		for(int i=0; i<1E5; i++) {
			list.add(list.size()-100,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}
