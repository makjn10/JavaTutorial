package collections.engineeringDigest.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// not thread-safe
public class LinkedHashMapMain {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> linkedHashMap2 = new LinkedHashMap<>(16, 0.75f, true);
		HashMap<String, Integer> hashMap = new HashMap<>();
		// order is maintained in linkedHashMap

		hashMap.put("Orange", 10);
		hashMap.put("Apple", 20);
		hashMap.put("Guava", 13);

		linkedHashMap.put("Orange", 10);
		linkedHashMap.put("Apple", 20);
		linkedHashMap.put("Guava", 13);

		linkedHashMap2.put("Orange", 10);
		linkedHashMap2.put("Apple", 20);
		linkedHashMap2.put("Guava", 13);
		linkedHashMap2.get("Apple");
		linkedHashMap2.get("Orange");

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// order is maintained in linkedHashMap, default is insertion order
		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// order is maintained in linkedHashMap, access order
		for (Map.Entry<String, Integer> entry : linkedHashMap2.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}


		LRUCache<String, Integer> studentMap = new LRUCache<>(3);
		studentMap.put("Bob", 99);
		studentMap.put("Alice", 65);
		studentMap.put("Ram", 78);
		studentMap.get("Bob");
		studentMap.put("Vipul", 98);

		System.out.println(studentMap);
	}
}
