/*
DEFINITIONS:

	- Algorithm: A list of steps for solving a problem.
		-- A recipe is an algorithm to make food.

	- Redundancy: Repeating the same lines of code.

	- Procedural Decomposition: Dividing a large problem into different methods.
		--This makes code easier to understand compared to just a single, large function.

	- Control Flow: The order in which source code is executed.
	 -- Methods just calling upon one another is bad code.

*/

//This is a single line comment.

/*This is a multi-
  line comment */

//Always capitalize the first letter of class names!
public class Lesson2 {

	//Use the main method as a general outline of the entire program.
	public static void main(String[] args) {
		/*Example of good method chaining and procedural decomposition, as the main method calls are being completed
		 at each statement before continuation. */
		namingVariables();
		redundancy(); //Instead of writing code twice,
		redundancy(); //the same method is called twice: 8 lines -> 2 lines
		magicNumbers();
		codeFormat();
	}

	//Always comment each method.
	public static void namingVariables() {
		//Always use meaningful variable names. i doesn't tell you what the variable is used for.
		int i = 4;
		//This is much better, example is telling me that the variable is being used as an example.
		int example = 4;
		//It's easier to read code when variable names aren't abstract.
		System.out.println(i);
		System.out.println(example);
		/*redundancy is next so it makes sense to call it, but the flow of a program should be decided
		 by a more general method. This is bad method chaining*/
		//redundancy();
	}

	//Use this comment to explain what the method does.
	public static void redundancy() {
		System.out.println("This code needs to be repeated.");
		System.out.println("It needs to be repeated twice");
		System.out.println("This is what methods are for");
		System.out.println("main will help print this message twice");
	}

	/*If a variable is only used within a method or methods that are directly chained, there is no reason
	 to make is a public variable*/
	public static final int KELVIN_TO_CELSIUS = 273; //BAD CODE! Only used in the magicNumbers method!

	//EX comment: Converts celsius to kelvin (As simple as that)
	public static void magicNumbers() {
		//What does 16 and 273 even mean in this program?
		int celsius = 16 + 273;
		//Variables should be created to keep track of such numbers.
		final int KELVIN_TO_CELSIUS = 273;
		int currentKelvin = 16;
		//The below statement is much easier to understand.
		celsius = currentKelvin + KELVIN_TO_CELSIUS;
	}

	public static void codeFormat() {
		/*It's a general rule to keep the character count of each line below 120. Because this line goes over 120
		 characters, it's better to make it a multi-line comment*/

		/*Make sure code is properly indented! The direct children that are nested within brackets should have one
		  tabs worth of spacing extra compared to the parent. */
			String badIndent = "Still works, but not as readable";
	badIndent = "Looks terrible";
		//To fix bad code like this on Eclipse, press CTRL + A and then CTRL + I
		String goodIndent = "Exactly one tabs worth of spacing";
	}
}
