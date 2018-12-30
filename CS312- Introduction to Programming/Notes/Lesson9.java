/*
DEFINITIONS:

	- Scanner: An object that can read input from many different sources.

	- Prompt: A message telling the user what to type.

	- Delimiter: A sequence of one or more characters used to specify the boundry between separate, independent regions
	in plain text.

	- Token: A unit of user input, separated and defined by delimiters.
		-- The standard delimiters are the whitespace and newline characters.

 */

//Importing the scanner class:
import java.util.Scanner;

public class Lesson9 {

	public static void main(String[] args) {
		//To construct a scanner for reading console input:
		Scanner keyboard = new Scanner(System.in);
		//Usually, only one scanner should be created to receive user input.
		scannerClass(keyboard);
		//It is good practice to close the scanner once it isn't needed anymore.
		keyboard.close();

		ifConditional();
		logicalOperators();
	}

	public static void scannerClass(Scanner keyboard) {
		//When using user input, use the print statement. The user pressing enter will automatically trigger a new line.
		System.out.print("Type any statement and press enter: ");
		//The .nextLine() method takes in all input until a newline character is found.
		System.out.println("You typed: " + keyboard.nextLine());

		System.out.print("Type in an integer: ");
		//The .nextInt() method takes in the next token and reads it as an integer.
		int intInput = keyboard.nextInt();
		System.out.println("The number you thought of was " + intInput);
		/*If only one token was expected but the user used whitespace, there will be extra content. In addition,
		there will also be the newline character at the end of the user input. It is possible to get rid of this
		unwanted input by calling objectName.nextLine(); It consumes the input and the return doesn't have to be saved*/
		keyboard.nextLine();

		System.out.print("Type in a decimal number: ");
		//The .nextDouble() method takes in the next token and reads it as a double.
		double doubleInput = keyboard.nextDouble();
		System.out.println("This is a double: " + doubleInput);
		keyboard.nextLine();

		System.out.print("Type whatever you want: ");
		//The .next() method takes in the next token and reads it as a string.
		System.out.println(keyboard.next());
		keyboard.nextLine();


	}

	public static void ifConditional() {
		//An if loop runs the code in its body if a checked conditional evaluates to true.
		if (true) {
			System.out.println("Because the conditional is true, I will be printed to the console.");
		}
		if (3 < 2) {
			System.out.println("3 isn't less than 2... I won't be printed to the console....");
		}

		//If an else block is used, the code in the block will execute if the conditional is false.
		if (false) {
			System.out.println("I won't execute");
		} else {
			System.out.println("But I will");
		}

		//Else if statements evaluate different conditionals if the if statement's conditional is false.
		if (7 == 8) {
			System.out.println("It's pretty clear why I won't execute");
		} else if (8 == 8) {
			System.out.println("Problem fixed. I will print to the console.");
		} else {
			System.out.println("Because of the else if statement, I won't be printed to the console");
		}

		//You can chain multiple else if statements.
		if (7 == 8) //If only one statement is in the body, if statements don't need brackets.
			System.out.println("If true, the else if statements won't run");
		else if (9 == 8)
			System.out.println("If I'm true, the last else if statement won't run");
		else if (7 == 8)
			System.out.println("If I'm false, nothing will execute");
	}

	//Logical operators are used to chain together multiple boolean values to produce a singular boolean value
	public static void logicalOperators() {
		//AND:
		//The && operator returns true when both statements are true. Else, it returns false
		System.out.println(true && false); //Logs 'false'

		//OR:
		//The || operator returns true when one of the statements are true. Else, it returns false
		System.out.println(true || false); //Logs 'true'

		//NOT:
		//The ! operator reverses the boolean value of a statement. True becomes false, while false becomes true.
		System.out.println(!false); //Logs 'true'
	}
}
