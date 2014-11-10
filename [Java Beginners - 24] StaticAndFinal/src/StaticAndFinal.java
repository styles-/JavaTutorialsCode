class Thing{
	// final = constant
	// static = shared among all types of this class
	public final static int LUCKY_NUMBER = 14;
	
	public String name; // instanced variable string
	public static String description; // static variable string
	
	
	public int id; // unique id for any object of type Thing
	public static int count = 0; // shared count for all types Thing
	
	// constructor for Thing class
	public Thing(){
		id = count; // each object has a unique id
		count++; // count is shared among all objects created with class Thing
	}
	
	// showName method
	public void showName(){
		System.out.println("Object id: " + id + ", " + description + ": " + name);
		
	}
	
	// showInfo static method: can't take in instanced variables, only static
	public static void showInfo(){
		System.out.println("Hello");
		// won't work System.out.println(name);
	}
}

public class StaticAndFinal {
	public static void main(String[] args){
		System.out.println("Before creating objects, count is: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		Thing.showInfo();
		Thing.description = "I am a thing";
		
		thing1.name = "Cody";
		thing2.name = "Olivia";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println("After creating objects, count is: " + Thing.count);
	}
}
