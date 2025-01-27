package oops4;

public class LearnAbstract {
	public static void main(String[] args) {
		// Vehicle v1 = new Vehicle(); not allowed as Vehicle is abstract class
		Car car = new Car();
		car.accelerate();
		car.brake();

		car.honks();
	}
}

// abstract class cannot be instantiated
// abstract class can be inherited, and then we can access its members
// abstract class can have abstract/ non-abstract methods
// if abstract class has an abstract method, child class MUST provide a definition for that method
// abstract method has no method body and can be created only in abstract class

// there is no concept of abstract variables

abstract class Vehicle {

	abstract void accelerate();
	abstract void brake();

	// complete methods
	void honks() {
		System.out.println("Vehicle honks");
	}
}

// Java abstraction allows to hide unnecessary details and only show the needed info

class Car extends Vehicle {

	@Override // annotation, can be ignored also
	void accelerate () {
		System.out.println("Car is accelerating");
	}

	@Override
	void brake () {
		System.out.println("Car is braking");
	}
}
