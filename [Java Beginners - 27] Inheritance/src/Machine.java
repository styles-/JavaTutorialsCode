
public class Machine {
	// private: only accessed in Machine, not in children
	// protected: accessible anywhere in package and children as well
	protected String name = "Machine Type 1";
	
	// don't override variables, only methods
	public void start(){
		System.out.println("Machine started.");
	}
	public void stop(){
		System.out.println("Machine stopped.");
	}
}
