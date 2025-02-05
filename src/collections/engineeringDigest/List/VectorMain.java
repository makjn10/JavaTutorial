package collections.engineeringDigest.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(4);
		System.out.println(vector.capacity());
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		System.out.println(vector.capacity());

		Vector<Integer> vector2 = new Vector<>(4, 3);
		System.out.println(vector2.capacity());
		vector2.add(1);
		vector2.add(1);
		vector2.add(1);
		vector2.add(1);
		vector2.add(1);
		System.out.println(vector2.capacity());

		Vector<Integer> vector3 = new Vector<>(Arrays.asList(1, 2, 3, 4));
		System.out.println(vector3.capacity());
		System.out.println(vector3);

		ArrayList<Integer> list = new ArrayList<>();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list.add(i);
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list.add(i);
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(list.size());


		Vector<Integer> list2 = new Vector<>();
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
