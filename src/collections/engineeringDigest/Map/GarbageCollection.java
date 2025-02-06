package collections.engineeringDigest.Map;

import java.lang.ref.WeakReference;

public class GarbageCollection {
	public static void main(String[] args) {

		Phone phone = new Phone("Apple", "Pro Max 16"); // Strong Reference
		System.out.println(phone);
		phone = null;

		// object becomes garbage now
		// no reference to above created object now
		// JVM garbage collector frees this memory, by deallocating mem from this object

		System.gc(); // this call suggests JVM to run garbage collector, but it's solely JVM's decision if it wants to run GC or not

		System.out.println(phone);


		WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Apple", "Pro Max 16"));
		System.out.println(weakReference.get());
		System.gc();

		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}
		System.out.println(weakReference.get());

	}
}

class Phone {
	String brand;
	String model;

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return brand + " - " + model;
	}
}
