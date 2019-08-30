/*
DEFINTIONS:

	- Collection (Data Structure): An object that stores data, each piece of data being called an element
		-- Java Library Data Structures: ArrayList, LinkedList, HashMap, TreeSet, PriorityQueue

	- List: A collection storing an ordered sequence of elements.
		-- A list has a size and is accessible by using a 0-based index.

 */

/*
WRAPPER CLASSES: (See creatingArrayLists())

	- boolean: Boolean
	- byte: Byte
	- char: Character
	- int: Integer
	- float: Float
	- double: Double
	- long: Long
	- short: Short

	NOTE: When creating the object, the parameters passed in can be either the primitive data type of respective class,
		  or a string representing the correct primitive value. Only the Character class accepts just a character as input.

 */

//To import the ArrayList data structure:
import java.util.ArrayList;

import java.util.Arrays;

public class Lesson25 {

	public static void main(String[] args) {
		creatingArrayLists();

		ArrayList<Integer> example = new ArrayList<Integer>();
		arrayListMethods(example);
	}

	public static void creatingArrayLists() {
		//To declare an ArrayList: ArrayList<<type>> <name> = new ArrayList<<type>>();
		ArrayList<String> example = new ArrayList<String>();

		//The type of ArrayList specified must be an object type:
		//ArrayList<int> error = new ArrayList<int>(); (SYNTAX ERROR)

		//Wrapper classes are classes that create objects containing primitive data types. They can be used instead:
		ArrayList<Integer> wrapperObject = new ArrayList<Integer>();
	}

	//The return statement and parameter declaration for ArrayLists are very similar to other data types:
	public static void arrayListMethods(ArrayList<Integer> example) {
		//To add elements:
		example.add(4); //Adds 4 to the end of the array

		example.add(0, 15); //Adds 15 at index 0. All values at and after the specified index are shifted to the right.
							//4 is now at index 1.

		example.set(1, 44); //Replaces 4 with 44. No elements are shifted from this method. The value is simply replaced.

		//To get information:
		System.out.println(example.indexOf(15)); //Prints 0, the index location of 15.
		//example.lastIndexOf() searches for the last index to contain the value instead of the first.

		System.out.println(example.get(1)); //Prints 44, the value at index 1.

		System.out.println(example.contains(new Integer(17))); //Prints false, because the Integer 17 isn't in the list.

		System.out.println(example.subList(0, 1)); //Prints 15. Prints values from [startingIndex, endingIndex).

		System.out.println(example.size()); //Prints 2, the size of the array.

		System.out.println(example.toString()); //Prints the array in string format.

		//To remove elements:
		example.remove(0); //Removes the element at the specified index. Values at and after the specified index are shifted to the left.
							//44 is now at index 0.

		example.remove(new Integer(44)); //Removes any occurrence of the specified object from the list.

		example.clear(); //Entire array is cleared and becomes empty.

		//Comparing two arrays:
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(
				"Aa", "Bb", "Cc", "Dd"));
		ArrayList<String> a2 = new ArrayList<String>(Arrays.asList(
				"Aa", "Bb", "Cc", "Dd"));

		System.out.println(a1.containsAll(a2)); //Prints true because a1 has all values in a2.

		System.out.println(a1.equals(a2)); //Prints true because the lists are the exact same.

		a1.retainAll(a2); //Removes all values from a1 that don't appear in a2. (Nothing is removed)

		a1.removeAll(a2); //Removes all values from a1 that appear in a2. (Everything is removed)

		a1.addAll(a2); //Adds all values from a2 to a1.

		a1.addAll(2, a2); //Adds all values at the specified index. Values at and after the index are shifted to the right.
							//("Cc" goes to index 6, "Dd" index 7)

		//To turn an ArrayList into a default array:
		String[] normalArray = (String[]) a1.toArray(); //Have to cast because ArrayLists store values as default objects.

	}
}
