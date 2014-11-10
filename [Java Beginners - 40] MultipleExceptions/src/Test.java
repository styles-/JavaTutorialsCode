import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class Test {
	public void run() throws IOException, ParseException {
		//throw new IOException();
		// can only throw one exception at a time, but this can throw any of the ones listed
		throw new ParseException("Error in command list.", 2);
	}
	
	public void input() throws IOException, FileNotFoundException {
		
	}
}
