import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" },
			{ "Sue", "Richard", "Bob", "Fred" }, { "Pete", "Mary", "Bob" }, };

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<>();

			for (String driver : driversList) {
				driverSet.add(driver);
			}

			personnel.put(vehicle, driverSet);
		}

		// Example usage
		Set<String> driversList = personnel.get("helicopter");

		for (String driver : driversList) {
			System.out.println(driver);
		}

		// Iterate through whole thing
		for (String vehicle : personnel.keySet()) {
			System.out.print(vehicle + ": ");
			Set<String> driverList = personnel.get(vehicle);

			for (String driver : driverList) {
				System.out.print(driver + " ");
			}

			System.out.println();
		}

	}

}
