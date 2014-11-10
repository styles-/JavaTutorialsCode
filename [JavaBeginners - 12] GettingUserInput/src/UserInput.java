import java.util.Scanner;

class Person{
	Scanner input = new Scanner(System.in);
	protected int age;
	private String name;
	
	// typical setter
	public void setName(String name){
		this.name = name;
	}
	
	// typical getter
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAgeAgain(){
		return age;
	}
	
	public int getAge(){
		System.out.println("Enter your age: ");
		return age = input.nextInt();
	}
}

public class UserInput {
	public static void main(String[] args){
		Person person1 = new Person();
		person1.setName("Cody A Price");
		int age = person1.getAge();
		System.out.println("Your age is: " + age);
		person1.setAge(14);
		person1.setName("Styles");
		System.out.println("Your new age is: " + person1.getAgeAgain() + " and your new name is " + person1.getName());
	}
}
