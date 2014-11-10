import world.Plant;

public class Grass extends Plant {
	public Grass(){
		// won't work, Grass & Plant in different packages, though it's a subclass, height has package visibility
		// System.out.println(this.height);
	}
}
