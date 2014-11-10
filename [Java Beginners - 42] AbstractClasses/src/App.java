
public class App {
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		car1.run();
		
		// base class for common functionality
		//Machine machine1 = new Machine();
		// cannot make a Machine object since it's abstract
		
		// anything can implement methods from  an interface
		// only children can implement abstract methods from a parent class 
		// no code in an interface, code in abstract classes allowed
	}
}
