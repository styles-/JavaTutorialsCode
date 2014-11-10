
public class App {

	public static void main(String[] args) {
		URLLibrary lib = new URLLibrary();
		
		for(String html: lib) {
			System.out.println(html.length());
			//System.out.println(html);
		}
	}

}
