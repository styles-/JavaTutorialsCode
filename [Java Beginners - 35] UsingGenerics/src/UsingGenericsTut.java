import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

public class UsingGenericsTut {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("chameleon");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		// There can be more than one type argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Java 7 style
		ArrayList<Animal> sumList = new ArrayList<>();
		// java infers what you need, don't need anything in 2nd <>
		
	}
}
