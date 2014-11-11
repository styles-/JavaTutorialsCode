import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class App {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(69, "Dog");
		map.put(14, "Fox");
		map.put(13, "Cat");
		map.put(7, "Giraffe");
		map.put(5, "Swan");
		map.put(8, "Swan");
		map.put(9, "Frog");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
}
