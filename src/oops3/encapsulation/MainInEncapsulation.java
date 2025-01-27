package oops3.encapsulation;

import oops3.learnPackage.Person;

public class MainInEncapsulation {

	// static block is run first, even before the m ain method call
	static {
		System.out.println("From MainInEncapsulation class");
	}

	public static void main(String[] args) {
		System.out.println("From MainInEncapsulation main");
		Person person = new Person(12, "Robin");
		// not accessible like this
		// person.age;
		System.out.println(person.getAge());
	}
}
