package oops;

public class Constructors {
	public static void main(String[] args) {
		Complex num1 = new Complex(); // this calls default constructor when no explicit constructor is defined
		num1.print();

		num1.a = 5;
		num1.print();

		Complex num2 = new Complex(6,9);
		num2.print();

		Complex result = num2.add(num1);
		result.print();

		// this keyword
		System.out.println(num2);
		num2.printThis();

	}
}

// Constructors are invoked implicitly when you create an object (instantiate an object)
// Constructor is a method having same name as of class and no return type
// If no explicit constructor is defined, Java compiler automatically creates a default constructor during run-time, this default constructor initializes instance variables with default values
// If an explicit constructor is defined, then default constructor will not be created by Java, hence not be able to be called. Then we need to explicitly create default constructor if needed

// Constructor can be overloaded but cannot be overridden
// Constructor cannot be abstract/static/final

class Complex {
	int a, b;

	// default constructor also has this signature
	Complex() {
		System.out.println("Constructor called!!");
		a = 0;
		b = 0;
	}
	// overloaded constructor
	Complex(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void print() {
		System.out.println(a + " + " + b + "i");
	}

	// this keyword is used to refer current object inside a method/constructor
	// mostly used to remove ambiguity in variable names
	void printThis() {
		System.out.println(this);
	}

	Complex add(Complex complex) {
		int newA = this.a + complex.a;
		int newB = this.b + complex.b;
		return new Complex(newA, newB);
	}
}