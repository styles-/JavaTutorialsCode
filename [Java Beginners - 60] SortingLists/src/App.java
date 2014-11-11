import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}

		return 0;
	}
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}

}

public class App {

	public static void main(String[] args) {
		
		/* sorting strings */
		List<String> animals = new ArrayList<>();

		animals.add("cat");
		animals.add("dog");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");

		//Collections.sort(animals, new StringLengthComparator());
		//Collections.sort(animals, new AlphabeticalComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for (String animal : animals) {
			System.out.println(animal);
		}

		/* sorting numbers */
		List<Integer> numbers = new ArrayList<>();

		numbers.add(101);
		numbers.add(525);
		numbers.add(35);
		numbers.add(1);
		numbers.add(69);

		
		// sort in reverse numerical order
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
			
		});
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		/* sorting arbitrary objects */
		List<Person> people = new ArrayList<>();
		
		people.add(new Person(3, "Sue"));
		people.add(new Person(1, "Joe"));
		people.add(new Person(4, "Olivia"));
		people.add(new Person(2, "Cody"));

		//Collections.sort(people, new Comparator<Person>());
		
		for(Person person: people) {
			System.out.println(person);
		}

	}
}
