// Car is a child class of Machine
// Machine is parent of Car
// Car is derived from Machine
// Car is a Machine
// Car inherits from machine
// Car is identical to a machine
// Cannot extend String since it's final
// Extending allows you to build onto classes

public class Car extends Machine {
	public void wipeWindShield(){
		System.out.println("Wiping windshield.");
	}
	// override method, car child specific method overrides machine parent method
	/*public void start(){
		System.out.println("Car started.");
	}*/

	// right click -> source -> override/implement methods
	@Override // annotation, helps spot errors, not necessary
	public void start() {
		System.out.println("Car started");
	}
	// name not visible if private in machine
	/*public void showInfo(){
		System.out.println("Car name: " + name);
	}*/
	public void showInfo(){
		System.out.println("Car name: " + name);
	}
	
}
