import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadingFilesScannerTut {
	public static void main(String[] args) throws FileNotFoundException {
		//String fName = "/Users/olivialedford/Desktop/input.txt";
		String fName = "input.txt";
		File textFile = new File(fName);
		
		Scanner in = new Scanner(textFile);
		int value = in.nextInt(); // nextInt doesn't read newline char(s)
		
		System.out.println("Read value: " + value);
		in.nextLine();
		
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + ": " + line);
			count++; 
		}
		
		in.close();
	}
}
