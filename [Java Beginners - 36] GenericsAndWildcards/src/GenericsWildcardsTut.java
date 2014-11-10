import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	// implicitly extends Object class
	
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a camera";
	}
	// extends Object and Machine classes
	
	public void snap() {
		System.out.println("Snap!");
	}

}

public class GenericsWildcardsTut {
	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());
		showList(list1);

		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());
		// ArrayList<Camera> is not a subclass of ArrayList<Machine>
		showList(list2);
		showList2(list1);
	}

	public static void showList(ArrayList<? extends Machine> list) {
		// ArrayList of unknown type, wildcard
		for (Machine value : list) { // need to treat everything as type Object with wildcards, unless you extend to a class
			// cannot pass camera or machine type with type Object
			System.out.println(value);
			value.start();
			// cannot pass camera type methods
			//value.snap();
		}
	}
	
	public static void showList2(ArrayList<? super Camera> list) {
		// ArrayList of unknown type, wildcard
		for (Object value : list) { // need to treat everything as type Object with wildcards, unless you extend to a class
			// cannot pass camera or machine type with type Object
			System.out.println(value);
			
			// cannot pass camera type methods
			//value.snap();
		}
	}

}
