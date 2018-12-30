/*
DEFINITIONS:

	- Pseudo-code: An English description of an algorithm.

	- Scope: The range of functionality of a variable.

	- Global variable: A variable that is accessible throughout the entire program.

	- Constant: A fixed value that cannot be altered throughout the execution of a program.

	- Class Constant: A global variable that is also a constant.

	- ASCII: A character encoding standard for electronic communication across all devices.
		-- Abbreviation for 'American Standard Code for Information'

 */

public class Lesson5 {

	//Example of a class constant
	public static final int CLASS_CONSTANT = 10;

	//Example of a global variable
	public static int globalVariable = 10;

	public static void main() {
		//mainOnly is only limited to the body of the main function.
		int mainOnly = 4;
		//Even though it is passed as a parameter, functionParameter is also limited to the main function.
		int functionParameter = 4;
		scope(functionParameter);
		scopeLimitation();
	}

	public static void scope(int differentVariable) {
		//The int functionParameter redeclared as differentVariable in this method.
		//differentVariable's scope is limited to the body of the scope function.
		System.out.println(differentVariable); //Will print out 4

	}

	public static void scopeLimitation() {
		//The global variable and class constant can be accessed by the class.
		System.out.println(CLASS_CONSTANT);
		System.out.println(globalVariable);
		/*Because CLASS_CONSTANT and globalVariable are being used by just scopeLimitation, they should only be
		  declared within the function (NOTE: Smaller the scope, the better)*/

		//Because it wasn't passed by the main function, functionParameter isn't redeclared and isn't accessible.
		//System.out.println(functionParameter); (SYNTAX ERROR)
	}
}
