
public class App {
	public static void main(String[] args) {
		int value = 4;
		//calculate(value);
		for(int i=1;i<15;i++) {
			System.out.println(factorial(i));
		}
	}
	
	private static void calculate(int value) {
		System.out.println(value);
		if (value == 0) return;
		calculate(value - 1);
	}
	
	private static long factorial(int value) {
		//System.out.println(value);
		if (value == 1) return 1;
		return (long) factorial(value-1)*value;
	}
}
