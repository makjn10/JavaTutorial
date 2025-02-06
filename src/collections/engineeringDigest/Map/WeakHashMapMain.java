package collections.engineeringDigest.Map;

import java.util.WeakHashMap;

public class WeakHashMapMain {

	public static void simulateApplicationRunning() {
		try {
			System.out.println("Simulating application running...");
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// entry in weakhashmap will automatically get removed when it's key is not being used (key should not have strong reference, for eg string literals get stored in SCP and remain for lifetime of program)

		String key1 = new String("img1");
		String key2 = new String("img2");
		String key3 = new String("img3");

		WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
		imageCache.put(key1, new Image("Image 1"));
		imageCache.put(key2, new Image("Image 2"));
		imageCache.put(key3, new Image("Image 3"));

		key1 = null;
		key2 = null;
		key3 = null;

		System.out.println(imageCache);
		System.gc();
		simulateApplicationRunning();
		System.out.println(imageCache);
	}
}

class Image {
	String name;

	public Image(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Image{" +
				"name='" + name + '\'' +
				'}';
	}
}