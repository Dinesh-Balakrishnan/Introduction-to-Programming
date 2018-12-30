/*
DEFINITIONS:

	- Array: Object that stores many values of the same type.

	- Element: One value in an array.

	- Index: A 0-based integer to access an element from an array.

 */

//Easiest way to print arrays is to use the Arrays.toString() method from the Arrays class:
import java.util.Arrays;

public class Lesson17 {

	//Variables outside methods are allowed to be declared without initialization:
	static byte defaultByteValue;
	static short defaultShortValue;
	static int defaultIntValue;
	static long defaultLongValue;
	static float defaultFloatValue;
	static double defaultDoubleValue;
	static char defaultCharValue;
	static boolean defaultBooleanValue;
	static String defaultStringValue;

	public static void main(String[] args) {
		defaultValues();

		int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String[] stringArray = arrays(intArray);

		//To print an array, use Arrays.toString(<variableName>):
		System.out.println(Arrays.toString(stringArray));

		//Using <variableName>.toString() prints out the variable's hash code, which is like its memory address.
		System.out.println(stringArray.toString());
	}

	public static void defaultValues() {
		//Because primitive values that aren't initialized could break a program when called upon, they have default values:

		System.out.println("The default byte value is: " + defaultByteValue); //0

		System.out.println("The default short value is: " + defaultShortValue); //0

		System.out.println("The default int value is: " + defaultIntValue); //0

		System.out.println("The default long value is: " + defaultLongValue); //0

		System.out.println("The default float value is: " + defaultFloatValue); //0.0

		System.out.println("The default double value is: " + defaultDoubleValue); //0.0

		System.out.println("The default char value is: " + defaultCharValue); // \u0000 (null Character)

		System.out.println("The default boolean value is: " + defaultBooleanValue); // false

		//All objects, such as strings, have a default value of null:
		System.out.println("The default string value is: " + defaultStringValue); //null
		System.out.println();
	}

	//To declare an array input and output in a method header, just include <type>[]
	public static String[] arrays(int[] array) {
		//To declare an array (<type>[] varName = new <type>[<size>]):
		String[] example1 = new String[9];

		//Another way to create an array (<type>[] varName = {<value>, <value>, <value>}):
		String[] example2 = {"Hi", "Hello", "Hey"};

		//To get the value of a certain element in an array (varName[<index>]):
		System.out.println(example2[0]); //Prints Hi
		System.out.println(example2[1]); //Prints Hello
		System.out.println(example2[2]); //Prints Hey
		//An array follows 0-based indexing, where the first element starts at 0.

		//The type of an element in an array is simply the array's type:
		String element = example2[1]; //element is "Hello", of type String

		//To find the size of an array:
		int length = example1.length; // Equals 9
		length = example2.length; //Equals 3

		//EX:
		int intLength = array.length;
		//Notice how the values in a final string can still be altered.
		final String[] returnArray = new String[intLength];

		//To loop through all values in an array, a for loop is best.
		for (int index = 0; index < intLength; index++) {
			if (array[index] % 2 == 0) {
				returnArray[index] = "A"; //Reassigning values in an array
			} else {
				returnArray[index] = "B";
			}
		}

		//To return an array, just state the name of the variable being returned:
		return returnArray;

		//If a specific element should be returned, just add [<index>]:
		//return returnArray[0];
	}
}
