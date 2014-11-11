
public class App2 {

	public static void main(String[] args) {
		int value = 7;
		Test test1 = new Test();
		
		test1.doStuff(value);
		
		System.out.println("Starting.");
		
		System.out.println("Incrementing value.");
		
		value++;
		value -= 8;
		
		System.out.println(value);
		
		System.out.println("Finishing.");
	}

}
