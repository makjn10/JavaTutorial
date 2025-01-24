package strings;

public class StringMethods {
	public static void main(String[] args) {

		// All string methods gives new String without affecting original string

		String name = "  Ram112   ";
		String name2 = "Ram112";

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());

		System.out.println(name2.startsWith("Ma"));
		System.out.println(name2.startsWith("Ra"));
		System.out.println(name2.endsWith("M112"));
		System.out.println(name2.endsWith("12"));

		System.out.println(name2.charAt(2)); // returns character
		// System.out.println(name2.charAt(22)); // gives java.lang.StringIndexOutOfBoundsException

		int age = 65;
		String ageStr = String.valueOf(age);
		System.out.println(ageStr);

		String newStr = name2.replace("am", "ob");
		System.out.println(newStr);
		System.out.println(name2);

		System.out.println(name2.contains("am"));
		System.out.println(name2.contains("ab"));

		System.out.println(name2.substring(2));
		System.out.println(name2.substring(2, 4));

		String temp = "Today is Monday";
		System.out.println(temp.split(" "));
		String[] arr = temp.split(" ");
		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println(name2.isEmpty());
		String blank = "";
		System.out.println(blank.isEmpty());

		char[] arr2 = name2.toCharArray();
		for (char c : arr2) {
			System.out.println(c);
		}
		
	}
}
