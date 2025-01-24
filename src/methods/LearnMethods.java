package methods;

// while compiling java linking process also happens which links these java methods helping java to know which method is where

public class LearnMethods {
	// main is static as we don't want to create an object to run code
	public static void main(String[] args) {

		// calling a method
		System.out.println(1);
		System.out.println(2);
		greet();
		System.out.println(3);
		System.out.println(4);
		System.out.println();

		int avg1 = average(4, 6);
		System.out.println("Returned average is " + avg1);
		int avg2 = average(5, 9);
		System.out.println("Returned average is " + avg2);
	}

	// components of a method
	// access modifier, return type, method name, method parameters, method body
	// static method can only call static methods, more about static once we learn about class and objects
	public static void greet() {
		System.out.println(5);
		System.out.println("Hello from method!!");
		System.out.println(6);
		return; // unnecessary as it will by default exit after last statement
	}

	// a and b are method parameters
	public static int average(int a, int b) {
		int avg = (a + b) / 2;
		System.out.println("The average is " + avg);
		return avg;
		// function exits on return statement
		// we can use return; or ignore writing return in functions where return type is void
	}
}
