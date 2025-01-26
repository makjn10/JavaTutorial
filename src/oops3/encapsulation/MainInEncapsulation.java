package oops3.encapsulation;

import oops3.learnPackage.Person;

public class MainInEncapsulation {
	public static void main(String[] args) {
		Person person = new Person(12, "Robin");
		// not accessible like this
		// person.age;
		System.out.println(person.getAge());
	}
}
