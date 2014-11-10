class Machine{
	private String name;
	private int code;
	
	public Machine(){
		this("Tits",23);
		System.out.println("Constructor running");
	}
	
	public Machine(String name){
		this(name, 0);
		System.out.println("Second constructor running");
		this.name = name;
	}
	
	public Machine(String name, int code){
		System.out.println("Third Constructor running");
		this.name = name;
		this.code = code;
	}
	public void getInfo(){
		System.out.println("Name: " + name + ". code = " + code + ".");
	}
}

public class Constructor {
	public static void main(String[] args){
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Styles");
		Machine machine3 = new Machine("Boobs",14);
		machine1.getInfo();
		machine2.getInfo();
		machine3.getInfo();
	}
}
