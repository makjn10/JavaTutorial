package oops3.learnPackage;

// Access Modifiers are used to set accessibility of classes, interfaces, variables, methods, constructors, data members, and methods
// 4 access modifiers
// - Default (Package private : Available to all in same package, inaccessible to other packages)
// - Private (Only available in same class)
// - Public (Accessible everywhere)
// - Protected (Package private + accessible in different package subclass)


// Encapsulation : bundling fields and methods inside a single class
// Protects outer classes from accessing and changing fields or methods using access modifiers (DATA HIDING)

public class Person {

	// static members are attached to class and not to object
	// static members do not need objects to be created to be accessed
	// static members are also accessible as per access modifier
	// For all objects it will be created only once and all objects will share the same copy
	// static variables are allocated memory only once when class is loaded in memory

	// static variables/methods can be used in static or non-static methods
	// non-static variables/methods cannot be used in static methods -> Compile time error
	static int count = 0; // can be accessed as Person.count

	// static block is run first, even before the m ain method call
	static {
		System.out.println("From Person class");
	}

	private final int age;
	private final String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		count++;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
