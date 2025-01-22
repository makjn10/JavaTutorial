package arrays;

public class BasicsOfArrays {
	public static void main(String[] args) {

		// Arrays are stored in contiguous memory
		// Array stores same type of data
		// 0 based index
		// allows random access, because data is stored in contiguous manner

		// declaring array
		int[] intArray; // currently this variable holds some random address

		// allocating memory to this array
		intArray = new int[5];
		// now this variable holds the address of first element of this contiguous block (each block is of 4 byte) of memory for 5 integers
		// by default 0 is stored at each block
		// the size of this array is fixed when initializing and cannot be changed dynamically

		// iterating in array
		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		// random access (internally this is calculated : address of first element + (index * sizeOf data type))
		intArray[0] = 1;
		intArray[1] = 3;
		intArray[2] = 5;

		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		// array length
		System.out.println("Length of array : " + intArray.length);

		// Other array initialization
		int[] marks = {98, 45, 54, 65, 66};
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();

		// System.out.println(marks[5]);
		// above statement gives IndexOutOfBoundsPosition Exception
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//	at arrays.JavaArrays.main(JavaArrays.java:45)

		// forEach loop on Arrays (forEach can be used on all iterable collections/data structures)
		for (int mark : marks) {
			System.out.print(mark + " ");
		}
		System.out.println();
	}
}
