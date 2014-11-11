import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(5, "five");
		map.put(4, "four");
		map.put(6, "six");
		map.put(2, "two");
		map.put(10, "ten");
		
		// second put overrides the first
		// can have duplicate values, not keys
		map.put(6, "Hello");
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			// hash maps are not in order, does not maintain order
			System.out.println(key + ": " + value);
		}
	}
}
