package oops2;


// Inheritance increases code reusability
// It allows to create many new classes (child classes) from a parent class
// These child classes can inherit properties and behaviours from parent class
// Java supports hierarchical, multi-level inheritance
// Java does not support multiple inheritance (we have a workaround for this using interface)

public class Inheritance {
	public static void main(String[] args) {

		Car car = new Car();
		car.wheelsCount = 4;
		car.model = "BMW";
		car.color = "Red";
		car.start();
	}
}