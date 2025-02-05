package collections.engineeringDigest.List;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListMain {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		// Copy on write means, whenever a write operation like adding or removing element,
		// instead of directly modifying the existing list
		// a new list is created, and the modification is applied to that copy
		// This ensures that other threads reading the list while it's being modified are unaffected

		// Reads : Fast and direct, as they happen on stable list
		// Writes : A new copy is created for every modification, the reference to the list is then updated

		// Eg : NotePad
		// notepad --> notepad-copy

		// CopyOnWriteArrayList is mostly used in read-intensive tasks with less writes

		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("Milk");
		shoppingList.add("Eggs");
		shoppingList.add("Bread");
		System.out.println("Initial shopping list : " + shoppingList);

		// forEach loop gives exception as we try to read while updating the list
		// Exception in thread "main" java.util.ConcurrentModificationException
		//	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
		//	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
		//	at collections.engineeringDigest.List.CopyOnWriteArrayListMain.main(CopyOnWriteArrayListMain.java:31)

//		for (String item : shoppingList) {
//			System.out.println(item);
//			if (item.equals("Eggs")) {
//				shoppingList.add("Butter");
//				System.out.println("Added butter while reading...");
//			}
//		}
//		System.out.println("Updated shopping list : " + shoppingList);

		// above code will run fine on CopyOnWriteArrayList

		for (int i = 0; i < shoppingList.size(); i++) {
			String item = shoppingList.get(i);
			System.out.println(item);
			if (item.equals("Eggs")) {
				shoppingList.add("Butter");
				System.out.println("Added butter while reading...");
			}
		}
		System.out.println("Updated shopping list : " + shoppingList);

		CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<>();
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list2.add(i);
			}
		});
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list2.add(i);
			}
		});

		t3.start();
		t4.start();

		try {
			t3.join();
			t4.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(list2.size());
	}

}
