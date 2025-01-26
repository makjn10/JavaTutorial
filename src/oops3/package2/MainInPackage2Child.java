package oops3.package2;

import oops3.learnPackage.Teacher;

public class MainInPackage2Child extends Teacher {
	public static void main(String[] args) {
		MainInPackage2Child mainInPackage2Child = new MainInPackage2Child();
		mainInPackage2Child.teachingClass = 4;
		// mainInPackage2Child.id = 0; // not accessible as private
		// mainInPackage2Child.degree = ""; // not accessible as default
		mainInPackage2Child.salary = 14000; // protected variable available in object of subclass

		Teacher teacher = new Teacher();
		teacher.teachingClass = 6;
		// teacher.salary = 5600; // not accessible with teacher object
	}
}
