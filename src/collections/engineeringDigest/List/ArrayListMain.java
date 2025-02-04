package collections.engineeringDigest.List;

import java.lang.reflect.Field;
import java.util.*;

public class ArrayListMain {
	static void printList(List<Integer> list) {
		for (int ele : list) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
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


		ArrayList<Integer> list2 = new ArrayList<>(4);
		// if we know initial capacity. This helps reducing the overhead of resizing array

		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(1);
		System.out.println(list2);

		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData = (Object[]) field.get(list2);
		System.out.println("Initial capacity : " + elementData.length);
		list2.add(1);
		System.out.println(list2);
		elementData = (Object[]) field.get(list2);
		System.out.println("New capacity : " + elementData.length);
		list2.remove(2);
		list2.remove(2);
		list2.remove(2);
		System.out.println(list2);

		elementData = (Object[]) field.get(list2);
		System.out.println("New capacity : " + elementData.length);

		// capacity of the list does not shrink automatically, we can shrink it using trimToSize() to save memory

		list2.trimToSize();
		elementData = (Object[]) field.get(list2);
		System.out.println("New capacity : " + elementData.length);


		Integer[] arr = {1, 2, 3};

		List<Integer> list3 = Arrays.asList(1, 2, 3);
		List<Integer> list4 = Arrays.asList(arr);
		List<Integer> list4NonImmutable = new ArrayList<>(list4);

		System.out.println(list2.getClass().getName());
		System.out.println(list3.getClass().getName());
		System.out.println(list4.getClass().getName());
		System.out.println(list4NonImmutable.getClass().getName());

		// list3.add(5); (gives exception)
		list3.set(1, 20);
		System.out.println(list3);

		// Arrays.asList at least allowed modifying elements. List.of does not even allow that
		List<Integer> list5 = List.of(1, 2, 3, 4); // immutable object // came in Java 9
		// list5.set(2, 110); // gives exception

		list4NonImmutable.addAll(list5);
		System.out.println(list4NonImmutable);

		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		fruits.add("Apple");
		fruits.add("Papaya");

		fruits.remove("Apple"); // removes first occurrence
		System.out.println(fruits);
		list4NonImmutable.remove(Integer.valueOf(1));
		System.out.println(list4NonImmutable);


		System.out.println(list);
		Integer[] array = list.toArray(new Integer[0]); // else it returns Object[]

		Collections.sort(list);
		System.out.println(list);

		list.sort(null); // null is passed instead of a comparator
		System.out.println(list);

		// Comparator is an interface which helps us to achieve custom ordering
		fruits.sort(null); // null is passed instead of a comparator, by default is sorts in ascending order
		System.out.println(fruits);

		fruits.sort(new StringLengthComparator());
		System.out.println(fruits);

		list.sort(new MyComparator());
		System.out.println(list);

		fruits.sort((s1, s2) -> s1.length() - s2.length());
		System.out.println(fruits);
	}
}

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.length() - o1.length();
	}
}

class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}