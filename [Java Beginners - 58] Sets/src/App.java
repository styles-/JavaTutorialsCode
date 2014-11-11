import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// HashSet does not retain order
		// Set<String> set1 = new HashSet<>();

		// LinkedHashSet remembers the order you added items in
		// Set<String> set1 = new LinkedHashSet<>();

		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<>();

		if (set1.isEmpty()) {
			System.out.println("Set is empty at start.");
		}

		set1.add("chameleon");
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		// adding duplicates does nothing
		set1.add("mouse");
		// sets only contain unique items

		if (!set1.isEmpty()) {
			System.out.println("Set is not empty after adding.");
		}

		System.out.println(set1);

		/* iteration */
		for (String element : set1) {
			System.out.println(element);
		}

		/* does set contain a given item? */
		if (set1.contains("aardvark")) {
			System.out.println("Contains aardvark.");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat");
		}

		/* intersection */
		Set<String> set2 = new TreeSet<>();

		set2.add("chameleon");
		set2.add("snake");
		set2.add("bear");
		set2.add("giraffe");
		set2.add("ant");
		set2.add("monkey");
		
		// make intersection a copy of set1
		Set<String> intersection = new HashSet<>(set1);
		intersection.retainAll(set2); // intersection of set1 and set2
		System.out.println("\n" + intersection);
		
		Set<String> difference = new HashSet<>(set1);
		difference.removeAll(set2); // things in set1 that aren't in set2
		System.out.println("\n" + difference);
	}

}
