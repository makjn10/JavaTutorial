package oops;

public class MethodOverloading {
	public static void main(String[] args) {
		Greet greet = new Greet();
		greet.greetings();
		greet.greetings("Tommy");
		greet.greetings("Billy");
		System.out.println(greet.greetings("Ram", 3));
		System.out.println(greet.greetings("Robin", 2));

	}
}

class Greet {

	// method overloading
	// methods can be ONLY be overloaded with difference in parameters (parameter type or number of parameters)
	// overloaded methods can have different return types

	void greetings() {
		System.out.println("Hello Good morning!");
	}

	void greetings(String name) {
		System.out.println("Hello " + name + ", Good morning!");
	}

	int greetings(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Hello " + name + ", Good morning!");
		}
		return count + 1;
	}

}