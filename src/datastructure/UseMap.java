package datastructure;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<String,Integer> fruit = new HashMap<>();
		fruit.put("Mango", 10);
		fruit.put("Grapes", 20);
		fruit.put("Strawberry", 30);
		fruit.put("Blackberry", 40);
		for (String i: fruit.keySet()) {
			System.out.println(i);
			System.out.println(fruit.get(i));
		}
		List<String> vegetable = new LinkedList<>();
		vegetable.add("carrot");
		vegetable.add("brocoli");

		List<String> animal = new LinkedList<>();
		animal.add("cow");
		animal.add("goat");

		HashMap<String, List<String>> map = new HashMap<>();
		map.put("Vegetable", vegetable);
		map.put("Animal", animal);

		// Print all values
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
