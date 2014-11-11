
public class App {
	/* replaced by enum
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;
	*/
	
	public static void main(String[] args) {
		// no enum, using ints
		//int animal = CAT;
		
		// using enum
		Animal animal = Animal.DOG;
		
		/*switch(animal) {
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		}*/
		
		// eclipse will fill in automatically with enum types
		switch(animal) {
		case CAT:
			System.out.println("Cat.");
			System.out.println(Animal.CAT.getClass());
			break;
		case DOG:
			System.out.println("Dog.");
			System.out.println(Animal.DOG.getClass());
			break;
		case MOUSE:
			System.out.println("Mouse");
			System.out.println(Animal.MOUSE.getClass());
			break;
		default:
			break;
		
		}
		
		System.out.println(Animal.MOUSE.getName());
		System.out.println(Animal.MOUSE.toString());
		System.out.println(Animal.DOG);
		
		// from Java.lang.Enum
		System.out.println("Enum name as a string: " + Animal.DOG.name());
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}
}
