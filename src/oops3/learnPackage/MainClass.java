package oops3.learnPackage;

// package is used to contain or group all related class, interface, enumerations, annotations
// Java stores packages as file system (Eg : oops3-learnPackage)

// importing a package
// import package.ClassName (import particular class)
// import package.* (import whole package)
// import statement is written between package and class definition

import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getTime());


		Teacher teacher = new Teacher();
		teacher.teachingClass = 12;
		// teacher.id = 5; // not accessible since private
		teacher.salary = 15000;
		teacher.degree = "B.ed";

		Person.count = 2;

	}
}
