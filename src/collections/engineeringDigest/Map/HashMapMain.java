package collections.engineeringDigest.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {

		// order of elements is not maintained here
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "Annie"); // O(1)
		map.put(1, "Alice");
		map.put(2, "Bob");
		map.put(3, "Charlie");
		map.put(4, "Dhruv");
		System.out.println(map);

		System.out.println(map.get(3)); // O(1)

		System.out.println(map.get(45));

		System.out.println(map.containsKey(2)); // O(1)

		System.out.println(map.containsValue("Bob"));

		for (Integer key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			entry.setValue(entry.getValue().toUpperCase());
		}
		System.out.println(map);

		map.remove(2);
		// map.remove();
		System.out.println(map);
		System.out.println(map.remove(3, "Alice"));
		System.out.println(map);


		HashMap<Integer, String> map1 = new HashMap<>(20, 0.5f);
		// 20 is initial capacity and 0.5 is load factor
		// Thus HashMap internal array will resize after 0.5 * 20 = 10 elements


	}
}
