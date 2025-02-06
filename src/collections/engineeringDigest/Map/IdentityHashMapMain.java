package collections.engineeringDigest.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapMain {
	public static void main(String[] args) {
		String key1 = new String("Key");
		String key2 = new String("Key");

		Map<String, Integer> map = new HashMap<>();
		map.put(key1, 1);
		map.put(key2, 2);
		System.out.println(key1.equals(key2));
		System.out.println(map);

		// in identityHashMap, Object's hashCode method is only used which is based on object memory address
		// in identityHashMap, instead of equals method, == operator is used to check equality, which will check address in case of objects
		Map<String, Integer> map2 = new IdentityHashMap<>();
		map2.put(key1, 1);
		map2.put(key2, 2);
		System.out.println(map2);

		String key3 = "keyN";
		String key4 = "keyN";
		map2.put(key3, 1);
		map2.put(key4, 2);
		System.out.println(map2);

		System.out.println(System.identityHashCode(key1));
		System.out.println(key1.hashCode());
		System.out.println(System.identityHashCode(key2));
		System.out.println(key2.hashCode());
		System.out.println(System.identityHashCode(key3));
		System.out.println(key3.hashCode());
		System.out.println(System.identityHashCode(key4));
		System.out.println(key4.hashCode());

	}
}
