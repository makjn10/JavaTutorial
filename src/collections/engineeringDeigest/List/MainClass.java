package collections.engineeringDeigest.List;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	static void printList(List<Integer> list) {
		for (int ele : list) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(6);
		System.out.println(list.get(0));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		for (int ele : list) {
			System.out.print(ele + " ");
		}
		System.out.println();

		System.out.println(list.contains(2));
		System.out.println(list.contains(5));

		list.remove(2);
		printList(list);

		list.add(6);
		list.add(2, 50);
		printList(list);

		list.set(2, 100);
		System.out.println(list); // calls toString() internally

	}
}
