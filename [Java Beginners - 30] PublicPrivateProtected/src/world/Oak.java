package world;

public class Oak extends Plant {
	public Oak(){
		// won't work, type is private within Plant class
		// type = "tree";
		
		// works since size is protected to Plant class, Oak is subclass of Plant
		this.size = "large";
		
		// no access specifier, Oak and Plant in same package
		this.height = 144;
	}
}
