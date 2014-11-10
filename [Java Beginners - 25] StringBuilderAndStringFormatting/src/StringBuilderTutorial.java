public class StringBuilderTutorial {
	public static void main(String[] args){
		
		// inefficient
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		
		// more efficient
		StringBuilder buffer = new StringBuilder();
		buffer.append("My name is Cody.");
		buffer.append(" ");
		buffer.append("I am a lion tamer.");
		System.out.println(buffer.toString());
		
		// shorthand
		StringBuilder sb = new StringBuilder();
		sb.append("My name is Styles")
		.append(". ")
		.append("I am a badass.");
		System.out.println(sb.toString());
		
		// formatting
		System.out.print("Here is some text\tThat was a tab.\nThat was a newline.");
		System.out.println(" More text.");
		
		// formatted print, like in c
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for(int i=0; i<20; i++){
			System.out.printf("%2d: %s\n", i, "here is some text");
		}
		
		// formatting floating point values
		System.out.printf("Total value: %.2f\n", 5.687);
		System.out.printf("Total value: %-6.1f\n", 343.23423);
	}
}
