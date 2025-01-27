package oops4;

// Nested non-static class -> Inner class
// Can access member of outer class
// to instantiate inner class we need to instantiate outer class first

// Nested static class
// cannot access members of outer class because nested static class does not require instantiation of outer class

// Nested class provide better Encapsulation

public class NestedClass {

	class Toy {
		int price;
	}

	static class PlayStation {
		int price;
	}

	public static void main(String[] args) {
		// Toy toy = new Toy(); // not allowed without instantiating outer class

		NestedClass nestedClass = new NestedClass();
		Toy toy = nestedClass.new Toy();
		toy.price = 5;
		System.out.println(toy.price);

		PlayStation ps = new NestedClass.PlayStation();

	}
}
