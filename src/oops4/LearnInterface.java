package oops4;

public class LearnInterface {
	public static void main(String[] args) {
		Monkey monkey = new Monkey();
		monkey.eats();
		monkey.sings();
		monkey.jumps();
	}
}

// An interface is designed to define a contract that implementing classes must adhere to.
// Main advantage of interface is that it allows us a class to implement multiple interfaces and thus this can act as multiple inheritance in a way
//Variables declared in an interface are always implicitly:
//		**public**: Accessible anywhere.
//		**static**: Belongs to the interface, not to any instance.
//		**final**: Constant and cannot be reassigned after being initialized.
// No Non-Static or Non-Final Variables

interface Animal {

	int legs = 0;
	// by default interface methods are public and abstract
	// Java assumes all methods in an interface are public and abstract by default to reduce verbosity. This ensures clarity and consistency for developers.
	void eats();
	void jumps();

	// Java 8 introduced default methods with body, these are public. This helps in reusability (Imagine 1000 classes implementing an interface, and you need new method)
	// Java 8 also introduced static methods in interfaces

	// Java 9 introduced private methods in interfaces
	default void runs() {
		System.out.println("Animal is running");
	}
}

interface Pet {
	int legs = 0;
	void sings();
	void jumps();
}

class Monkey implements Animal, Pet {

	public int getLegs() {
		return Animal.legs;
	}

	@Override
	public void eats() {
		System.out.println("Monkey is eating");
	}

	@Override
	public void jumps() {
		System.out.println("Monkey is jumping");
	}

	@Override
	public void sings() {
		System.out.println("Monkey is singing");
	}
}