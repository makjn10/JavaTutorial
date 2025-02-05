package collections.engineeringDigest.List;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5); // O(1)
		linkedList.add(5); // O(1)
		linkedList.addLast(6); // O(1)
		linkedList.addFirst(0); // O(1)
		System.out.println(linkedList);

		System.out.println(linkedList.get(2)); // O(n)
		System.out.println(linkedList.getFirst()); // O(1)
		System.out.println(linkedList.getLast()); // O(1)

		linkedList.removeFirst();
		linkedList.removeLast();

		System.out.println(linkedList);
		linkedList.remove(2);
		System.out.println(linkedList);
		linkedList.remove(Integer.valueOf(2));
		System.out.println(linkedList);

		linkedList.removeFirstOccurrence(5);
		System.out.println(linkedList);

		LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
		LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("Dog", "Lion"));
		linkedList1.removeAll(linkedList2);

		System.out.println(linkedList1);

	}
}
