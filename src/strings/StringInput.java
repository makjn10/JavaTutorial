package strings;

import java.util.Scanner;

public class StringInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine(); // takes whole line as input
		String s2 = sc.next(); // takes first word as input

		System.out.println(s1);
		System.out.println(s2);

/*		this is s1
		this is s2
		this is s1
		this*/
	}
}
