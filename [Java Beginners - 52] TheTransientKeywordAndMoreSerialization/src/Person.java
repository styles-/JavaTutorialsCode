import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 4801633306273802062L;
	// used to prevent things from being serialized
	private transient int id;
	private String name;

	private static int count;

	public Person() {
		System.out.println("Default constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("2 argument constructor");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
	}
}
