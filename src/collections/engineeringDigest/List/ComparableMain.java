package collections.engineeringDigest.List;

import java.util.ArrayList;
import java.util.List;

public class ComparableMain {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 3.5));
		students.add(new Student("Bob", 3.7));
		students.add(new Student("Abby", 3.5));
		students.add(new Student("Dhruv", 3.9));
		students.sort(null);
		System.out.println(students);
	}
}
