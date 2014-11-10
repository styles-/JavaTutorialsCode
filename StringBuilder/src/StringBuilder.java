import java.io.IOException;

public class StringBuilder {
	public static void main(String[] args){
		
		// inefficient
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		
		StringBuilder buffer = new StringBuilder();
		try {
			((Appendable) buffer).append("My name is Cody.")
			.append(" ")
			.append("I am a lion tamer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(buffer.toString());
	}
}
