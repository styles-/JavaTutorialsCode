package world;

public class Plant {
	// bad practice to declare instance variables as public
	public String name;
	
	// acceptable practice, public constants (final)
	public final static int ID = 14;
	
	// hidden from outside this class
	private String type;
	
	// accessed within Plant and children classes, also within the same package
	protected String size;
	
	// package level visibility
	int height;
	
	public Plant(){
		this.name = "Euonymous";
		this.type = "plant";
		this.size = "medium";
		this.height = 14;
	}
}
