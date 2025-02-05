package collections.engineeringDigest.List;

import java.util.LinkedList;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// Stack extends Vector in Java
		// Last in First Out (LIFO) data structure
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack);

		System.out.println(stack.peek());
		System.out.println(stack);

		System.out.println(stack.isEmpty());

		// These methods are also accessible since stack extends Vector
		// stack.add(2);
		// stack.remove(1);

		System.out.println(stack);
		// index from top (1 - based)
		System.out.println(stack.search(30));


		// We can use LinkedList as stack too
		// In single-threaded env this can be used, as stack is thread-safe and adds overhead of synchronization
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addLast(10);
		linkedList.addLast(20);
		linkedList.addLast(30);
		linkedList.addLast(40);
		System.out.println(linkedList);
		System.out.println(linkedList.getLast()); // peek O(1)
		System.out.println(linkedList.removeLast()); // pop O(1)
	}
}
