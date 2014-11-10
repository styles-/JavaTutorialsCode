package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo3 {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); don't do in distributed programs
			// too vague, needs more info
			System.out.println("File could not be opened.");
		}
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("text.txt");

		FileReader fr = new FileReader(file);
	}
}
