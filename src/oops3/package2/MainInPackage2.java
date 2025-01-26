package oops3.package2;

import oops3.learnPackage.Person;
import oops3.learnPackage.Teacher;

public class MainInPackage2 {
	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.teachingClass = 5;
		// teacher.id = 5; // not accessible as private
		// teacher.salary = 12500; // not accessible as protected
		// teacher.degree = "";

		// Person.count = 2 // not accessible
	}
}
