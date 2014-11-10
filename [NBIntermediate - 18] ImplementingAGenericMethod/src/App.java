
public class App {

	public static void main(String[] args) {
		Integer[] iArray = { 1, 2, 3, 4, 5 };
		Character[] cArray = { 'c', 'o', 'd', 'y', 'p' };

		printMe(iArray);
		printMe(cArray);

	}
	
	// call overload method specific to passed data types first
	// generic method
	public static <Generic> void printMe(Generic[] x) {
		for (Generic type: x)
			System.out.printf("%s ", type);
		System.out.println();
	}
}
