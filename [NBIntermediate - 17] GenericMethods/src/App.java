import java.util.*;

public class App {

	public static void main(String[] args) {
		Integer[] iArray = {1,2,3,4};
		Character[] cArray = {'c','o','d','y'};
		
		printMe(iArray);
		printMe(cArray);
	}

	private static void printMe(Character[] cArray) {
		for(Character x: cArray) {
			System.out.printf("%s ", x);
		}
		System.out.println();
	}

	private static void printMe(Integer[] iArray) {
		for(Integer x: iArray) {
			System.out.printf("%s ", x);
		}
		System.out.println();
	}

}
