/*
DEFINITIONS:

	- ArrayIndexOutOfBoundsException: An error thrown when an index value is called that an array doesn't have.

	- Traversal: An examination of each element in an array

	- Value Semantics: Behaviors where values are copied when assigned, passed as parameters, or returned.
		-- All primitive types follow value semantics.

	- Reference Semantics: Behaviors where variables only store the address on an object in memory.
		-- All object types are stored using reference semantics

*/

//Arrays class (Some methods explained in the arraysClassMethods() method):
import java.util.Arrays;

public class Lesson18 {

	public static void main(String[] args) {
		arrayProblems();
		arraysClassMethods();

		int[] array = {1, 2, 3, 4};
		arrayReference(array);
		System.out.println(Arrays.toString(array)); //Prints [2, 4, 6, 8]
	}

	public static void arrayProblems() {
		//There are three main problems when dealing with arrays:

		//1. It is not possible to resize an array:
		int[] example = new int[4];
		//example.length = 8; (Will throw an exception error)

		//2. It is not possible to compare arrays with the two general compare expressions:
		int[] a1 = {42, 1};
		int[] a2 = {42, 1};
		System.out.println(a1 == a2); //Prints false
		System.out.println(a1.equals(a2)); //Prints false

		//You can't print an array like you do most other variable types:
		System.out.println(example); //Prints the hash code: [I@7852e922
	}

	public static void arraysClassMethods() {
		String[] a1 = {"Hi", "Hello", "Hey", "What's up?", "How are you?", "Are you doing well?", "How's it been?"};
		String[] a2 = {"Hi", "Hello", "Hey", "What's up?", "How are you?", "Are you doing well?", "How's it been?"};
		//a3 has "Hello"'s and "Hi"'s indexes switched
		String[] a3 = {"Hello", "Hi", "Hey", "What's up?", "How are you?", "Are you doing well?", "How's it been?"};
		int[] a4 = {4, 7, 8, 10, 19, 2, 9};

		//Arrays.sort() sorts a string in numerical or alphabetical order:
		Arrays.sort(a3);
		Arrays.sort(a4);
		System.out.println(Arrays.toString(a3)); //Arrays.toString() prints out the array and not its hash code.
		//Prints [Are you doing well?, Hello, Hey, Hi, How are you?, How's it been?, What's up?]
		System.out.println(Arrays.toString(a4));
		//Prints [2, 4, 7, 8, 9, 10, 19]

		//Arrays.equals() compares both items and their position in an array's index:
		System.out.println(Arrays.equals(a1, a2)); //Prints true
		System.out.println(Arrays.equals(a1, a3)); //Prints false

		//Arrays.fill() sets every single element in an array to a desired value:
		Arrays.fill(a1, "TAKING OVER");
		System.out.println(Arrays.toString(a1));
		//Prints [TAKING OVER, TAKING OVER, TAKING OVER, TAKING OVER, TAKING OVER, TAKING OVER, TAKING OVER]

		//Arrays.copyOf() creates a copy of the specified array and is truncated or padded with default values to obtain the specified length.
		System.out.println(Arrays.toString(Arrays.copyOf(a2, 1))); //Prints [Hi]
		System.out.println(Arrays.toString(Arrays.copyOf(a2, 9)));
		//Prints [Hi, Hello, Hey, What's up?, How are you?, Are you doing well?, How's it been?, null, null]

		/*Arrays.binarySearch() performs a binary search on an array to find a value. The array should be sorted, or the value most likely
		 will not be found.*/
		//NOTE: Remember that the two arrays have been sorted first.
		System.out.println(Arrays.binarySearch(a4, 7)); //Prints 2 (Index of 7)
		System.out.println(Arrays.binarySearch(a3, "Hey")); //Prints 2 (Index of "Hey")
	}

	public static void arrayReference(int[] sameArray) {
		//Notice how the method returns void
    //Another method to traverse an array using a for loop (Use this if you don't need the index):
		for (int element : sameArray) {
			element *= 2;
		}
		/*Nothing needs to be returned, because the array is an object type that follows reference semantics.
		 As a result, the array passed as a parameter isn't copied and is directly being modified.*/

		//When changing the array assigned to a variable, use the following syntax: var = new <type>[] {<value>, <value> ..};
		sameArray = new int[] {6, 7, 8, 9};
		/*Because of reference semantics, the sameArray variable isn't changing the array that it is assigned to.
		 Instead, it is referencing another array. In the array in main, the values won't be equal to these new values*/
	}
}
