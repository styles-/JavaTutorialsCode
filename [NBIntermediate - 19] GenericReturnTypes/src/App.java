public class App {
	public static void main(String[] args) {

		System.out.println(max(23, 42, 1));
		System.out.println(max("apples", "tots", "chicken"));
	}

	public static <Generic extends Comparable<Generic>> Generic max(Generic a,
			Generic b, Generic c) {
		Generic max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}

		if (c.compareTo(max) > 0) {
			max = c;
		}

		return max;
	}
}
