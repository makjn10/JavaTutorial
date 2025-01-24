package strings;

public class CompareStrings {
	public static void main(String[] args) {

		// comparing strings in Java
		String name = "Ram";
		String name2 = "Ram";
		String name3 = new String("Ram");
		String name4 = new String("RAM");

		System.out.println("name and name2 are same : " + (name == name2));
		System.out.println("name and name3 are same : " + (name == name3));
		// In case of OBJECTS, == compares the reference addresses that the variable is storing, actual value is not compared
		// to compare values, use equals method. Internally equals method compare the hash of the object which we will learn later

		System.out.println("name and name2 are equal : " + (name.equals(name2)));
		System.out.println("name and name3 are equal : " + (name.equals(name3)));

		// Java is case-sensitive
		// comparing while ignoring case
		System.out.println("name and name4 are equal : " + (name.equals(name4)));
		System.out.println("name and name4 are equalIgnoreCase : " + (name.equalsIgnoreCase(name4)));


	}
}
