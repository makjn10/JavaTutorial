package collections.engineeringDigest.Map;

import java.util.LinkedHashMap;
import java.util.Map;

// only 3 entries in cache
// if more entries come, least used entry get deleted
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private int capacity;

	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	// this method gets invoked on put or putAll
	@Override
	protected boolean removeEldestEntry (Map.Entry<K, V> eldest) {
		return size() > capacity;
	}
}
