import world.Plant;

/*
 * private		--- only within same Class
 * public		--- from anywhere
 * protected	--- subClass, same package
 * no modifier	--- same package only
 * classes can be public class or just class,
 * just class means it is only visible in that file
 * public class means it is visible outside the file, but needs to be same name as the file
 */

public class PublicPrivateProtectedTutorial {
	public static void main(String[] args){
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		// won't work, type is private within Plant class
		// System.out.println(plant.type);
		
		// won't work, size is protected, Plant is in a different package than PublicPrivateProtected
		// System.out.println(plant.size);
		
		// PPP & Plant in different package, height has package visibility
		// System.out.println(plant.height);
	}
}
