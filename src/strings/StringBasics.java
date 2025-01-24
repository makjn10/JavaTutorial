package strings;

public class StringBasics {
	public static void main(String[] args) {

		// String is a non-primitive data type in Java
		// String is an object that represents sequence of char values
		// array of characters can also work in a same way as String, internally String class also deals with a char array
		char[] nameArray = {'R', 'a', 'm'};

		String name = "Ram"; // String literal method (as Strings were frequently used, this way was introduced)
		String random = "Ram";

		// Two types of memory -> heap and stack memory
		// reference to object is in stack memory and actual object in heap memory
		// For string, a specific area is assigned in heap memory, STRING CONSTANT POOL
		// random and name (using literal method) points to same object stored in SCP (Java first checks if string is present in SCP or not)
		// It is done in java to optimize storage as String is used very frequently

		// But when we make string using constructor, that string will not be stores in SCP, but in other normal area of heap memory
		String name2 = new String("Ram"); // Using String constructor

		// String IMMUTABILITY
		// Once a String object is created, it's data or state cannot be changed, only the reference variable can point to some other string

		String x = "Robin";
		System.out.println(x);
		x = "Alex";
		// Robin object is still present in memory, a new memory block containing Alex is created and x points to that
		// Garbage collector will clean unused object in some time
		System.out.println(x);

		x = x + " Gates"; // string concatenation
		// Here also a new string is created in SCP "Alex Gates" and then c is pointed to that

		// If strings were immutable, concept of SCP wouldn't have worked
		// Also for security reasons, strings are made immutable in java
	}
}
