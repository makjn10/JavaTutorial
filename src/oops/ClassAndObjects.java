package oops;

public class ClassAndObjects {
	public static void main(String[] args) {

		// Java is Object-Oriented Programming language
		// emphasize the use of objects to model real-world entities and encapsulate data and behavior

		// Class and Objects
		// Class is a blueprint which defines some properties and behaviours (LOGICAL entity, no memory allocated, only stored once in metaspace)
		// Object is an instance of a class which has those properties and behaviours attached (PHYSICAL entity, physical memory allocated in heap memory when it is created)
		// Class is declared once, multiple objects created of class
		// Class can be seen as user defined data type

		// creating object
		Dog dog1 = new Dog();
		dog1.walk();
		dog1.bark();
		dog1.printDetails();

		Dog dog2 = new Dog();
		dog2.name = "Billy";
		dog2.age = 11;
		dog2.walk();
		dog2.bark();
		dog2.printDetails();

	}
}

// One file can have as many class as we want but only one public class matching file's name
// Execution starts at main method of public class
// non-public clas
// Capital Letter start for class (naming convention)
class Dog {

	// properties
	String name; // by default null
	int age; // by default 0

	// behaviour (methods)
	void printDetails() {
		System.out.println("This dog's name is " + name + " and age is " + age);
	}

	void walk() {
		System.out.println(name + " is walking");
	}

	void bark() {
		System.out.println(name + " is barking");
	}
}