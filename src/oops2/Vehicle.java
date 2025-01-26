package oops2;

public class Vehicle {
	int wheelsCount;
	String model;

	final int gears = 4;
	final String regYear;
	// for final variables we need to assign value to it while declaring or in constructor
	// value of final variable cannot be changes


	Vehicle () {
		System.out.println("Creating a vehicle instance");
		regYear = "2021";
	}

	Vehicle (int wheelsCount, String model) {
		System.out.println("Creating a vehicle instance with parameters");
		this.wheelsCount = wheelsCount;
		this.model = model;
		regYear = "2021";
	}

	void start() {
		System.out.println("Vehicle is starting");
	}

	// final methods cannot be overridden by child/subclass
	final void brake() {
		System.out.println("STOPPING....");
	}

}


// No class can inherit this class as it is final
final class VehicleTemp {

}

// not possible
//class CarTemp extends VehicleTemp {
//
//}
