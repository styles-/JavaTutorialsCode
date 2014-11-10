import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class App {
	public static void main(String[] args) {
		Test test = new Test();
		
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/* Java 7
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception catched");
		}
		
		try {
			test.input();
		} catch (FileNotFoundException e) { // needed first, since it's lower in hierarchy as a child
			// handle children before parent
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
