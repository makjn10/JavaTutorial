package oops2;

public class Car extends Vehicle{

	// Own property
	String color;

	// Method Overriding
	// Now child's function will be executed
	// Java searches for a function from child class to it's parent and then grandparent and so on...
	// Topmost level class is "Object" class
	// Method overriding is runtime polymorphism
	// When overriding method, return type and parameter type should be same as definition is already present in parent class

	void start () {
		System.out.println("Car is starting");
		super.start();
	}

	// overloading the overridden method
	int start (int x) {
		return 2;
	}

	// super keyword
	// it is used to access the instance variables, methods and constructor of IMMEDIATE parent class
	// by default, the constructor of this class will call the default constructor if it's parent class and so on
	// we can use super to call any other constructor of the class

	Car () {
		// call to constructor of parent using super should be the first line
		// thus either this() or super() can be used as both should be the first line when used

		// super(); -> called by default if default constructor is there
		super(0, "NULL");
		System.out.println("Creating a car instance");
	}

	// Now if vehicle class did not have default constructor overridden, then we will have to pass the parameters required in Vehicle class constructor while creating the object of Car class


/*
	cannot be done as it is final in parent class
	void brake() {

	}
*/

}
