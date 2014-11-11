
public class Robot {
	private int id;

	class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging..");
			// cannot access id unless id declared static
		}
	}
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot: " + id);
		Brain brain = new Brain();
		brain.think();
		
		String name = "Robert";
		
		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
	
	
}
