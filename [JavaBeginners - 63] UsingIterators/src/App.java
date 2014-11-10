import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		// ListIterator
		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {
			String animal2 = it.next();
			System.out.println(animal2);

			// can't be done in a for each loop
			if (animal2.equals("cat")) {
				it.remove();
			}
		}

		System.out.println();

		// Modern iteration, Java 5 and later

		// for iteration
		for (String animal : animals) {
			System.out.println(animal);
		}
	}

}
