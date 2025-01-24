package methods;

import java.util.Random;

public class MathClass {
	public static void main(String[] args) {
		// Math.random returns a double between 0 and 1
		int a = (int) (Math.random() * 10), b = (int) (Math.random() * 8);
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		// random number between two numbers
		int ranAB = (int) (Math.random() * (b - a + 1) + a);
		System.out.println("Random number between a and b : " + ranAB);

		System.out.println("Min of a and b : " + Math.min(a, b));
		System.out.println("Max of a and b : " + Math.max(a, b));
		System.out.println("SquareRoot of a : " + Math.sqrt(a));
		System.out.println("a ^ b : " + Math.pow(a, b));
		System.out.println("Absolute value of -a : " + Math.abs(-1 * a));
		System.out.println("Floor of SquareRoot of a : " + Math.floor(Math.sqrt(a)));
		System.out.println("Ceil of SquareRoot of a : " + Math.ceil(Math.sqrt(a)));
		System.out.println("Round of SquareRoot of a : " + Math.round(Math.sqrt(a)));

		// Math class have other functions also, can be checked on internet
	}
}
