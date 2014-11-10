// functional interface: only one method
interface Executable {
	int execute(int a, int b);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute(14, 13);
		System.out.println("Return value is: " + value);
	}
	
	public void run(StringExecutable a) {
		System.out.println("Executing code block ...");
		int value = a.execute("Hello");
		System.out.println("Return value is: " + value);
	}
}

// () -> System.out.println("Hello there.");

/*
 * runner.run(() -> {
 * 		System.out.println("This is code passed in a lambda expression.");
 * 		System.out.println("Hello there."); 
 * });
 */

/*
 *	runner.run(() -> {
		System.out.println("This is code passed in a lambda expression.");
		System.out.println("Hello there.");
		return 8;
	});
 */

/*
 * 	runner.run(() -> {
		return 9;
	});
 */

// runner.run(() -> 10);

/*
 * 	runner.run((int a) -> {
		System.out.println("This is code passed in a lambda expression.");
		System.out.println("Hello there.");
		return 8 * a;
	});
 */

// runner.run((a) -> 10 * a);

public class App {

	public static void main(String[] args) {
		int c = 100;
		int d = 77;
		Runner runner = new Runner();
		
		runner.run(new Executable() {

			@Override
			public int execute(int a, int b) {
				System.out.println("Hello there!");
				return c + 7 + a;
			}

		});

		System.out.println("------------------");

		// lambda expression below
		runner.run((int a, int b) -> {
			System.out.println("This is code passed in a lambda expression.");
			System.out.println("Hello there.");
			return a + b + c;
		});
		
		runner.run((int a, int b) -> {
			return 9 / a;
		});
		
		// ambiguous method for type Runner
		//runner.run(( a) -> 10 * a);
		
		runner.run((int a, int b) -> 10 * a % b);
		
		Object codeblock = (Executable) (a,b) -> {
			System.out.println("Hello there.");
			return a + b + c;
		};
		
		runner.run((Executable) codeblock);
		
	}
}
