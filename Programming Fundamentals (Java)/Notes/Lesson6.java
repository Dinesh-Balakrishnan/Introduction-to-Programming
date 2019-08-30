//When arrays are used, their respective Java array package needs to be imported.
import java.util.Arrays;

/*
DEFINITIONS:

	- Value Semantics: When primitive variables such as ints are passed as variables, their values are copied.
		-- This means that when the respective parameter variable is modified, no change occurs to the variable passed in.
		
	- Reference Semantics: When objects are passed as variables, another variable references to the same object.
		-- No data is copied; the same object passed in is altered.

	- Parameter: A value that distinguishes similar tasks.

 */
public class Lesson6 {

	public static void main(String[] args) {
		final int exampleInput1 = 20;
		final int exampleInput2 = 40;
		int[] exampleInput3 = {0, 1, 2, 3, 4, 5};

		//Using functions with parameters is an important way to reduce redundancy.
		parameterFunction(exampleInput1);
		parameterFunction(exampleInput2);

		//Calling a parameter function the correct parameter input will result in a syntax error
		// parameterFunction(); (SYNTAX ERROR)

		//Methods with the same name but different parameter requirements are different methods
		int returnValue = parameterFunction(exampleInput1, exampleInput2);
		System.out.println(returnValue + " was returned from parameterFunction");

		//Object types (NOTE: String acts like a primitive) aren't copied in a parameter function. They are directly referenced.
		arrayExample(exampleInput3);
		System.out.println(Arrays.toString(exampleInput3)); //Prints out [0, 10, 20, 30, 40, 50] to the console.
	}

	//When we want to the computer run the same process but change the information it uses, we use parameters.
	public static void parameterFunction(int num) {
		System.out.println("The square root of " + num + " is " + Math.sqrt(num));
		System.out.println("The square of " + num + " is " + Math.pow(num, 2));
	}

	//Same method name, but syntactically works because of different parameter requirements.
	//int replaces the void keyword. This means that the function will return an integer.
	public static int parameterFunction(int num1, int num2) {
		//As soon as the return keyword is run, the current method will stop running.
		return num1 + num2;
		//The below System.out.println code would not run, because of the return statement.
		//System.out.println("This will not run"); (UNRESOLVED COMPILATION ERROR)
	}

	/*Array is an object data type, so the variable isn't redeclared in the arrayExample function; instead,
	 another variable references the same array.*/
	public static void arrayExample(int[] sameArray) {
		int length = sameArray.length;
		for (int index = 0; index < length; index++) {
			sameArray[index] *= 10;
		}
		//Nothing needs to be returned from the function, the array has already been directly altered by the function.
	}
}
