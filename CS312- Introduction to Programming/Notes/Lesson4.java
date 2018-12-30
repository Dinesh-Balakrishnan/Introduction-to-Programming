/*
DEFINITIONS:

	- Nested Loop: A loop placed inside another loop.

	- Control Structure: A syntactic structure that controls the execution of other statements.

 */

public class Lesson4 {

	public static void main(String[] args) {
		comparisonOperators();
		shortcutOperators();
		forLoop();
	}

	public static void comparisonOperators() {
		int value1 = 4;
		double value2 = 5.6;
		double value3 = 4.0;

		//'LESS THAN' Operator
		System.out.println(value1 < value2); //Prints true

		//'LESS THAN OR EQUAL TO' Operator
		System.out.println(value1 <= value3); //Prints true

		//'GREATER THAN' Operator
		System.out.println(value1 > value3); //Prints false

		//'GREATER THAN OR EQUAL TO' Operator
		System.out.println(value1 >= value2); //Prints false

		//'EQUALS' Operator
		System.out.println(value1 == value3); //Prints true

		//'DOESN'T EQUAL' Operator
		System.out.println(value1 != value2); //Prints true
	}

	public static void shortcutOperators() {
		int modify = 0;

		//'INCREMENT' Operator: modify = modify + 1;
		modify++; // modify == 1

		//'DECREMENT' Operator: modify = modify - 1;
		modify++; // modify == 0

		//'ADDITION ASSIGMENT' Operator: modify = modify + value;
		modify += 17; // modify == 17

		//'SUBTRACTION ASSIGMENT' Operator: modify = modify - value;
		modify -= 7; // modify == 10

		//'DIVISION ASSIGMENT' Operator: modify = modify / value;
		modify /= 5; // modify == 2

		//'MULTIPLICATION ASSIGMENT' Operator: modify = modify * value;
		modify *= 14; // modify == 28

		//'MODULO ASSIGMENT' Operator: modify = modify % value;
		modify %= 4; // modify == 0
	}

	public static void forLoop() {
		//The for loop is a control structure.
		//Its syntax for the header as follows: for(initialization; test; update) {}
		//The statements inside the for loop are the body.

		//Process: Initialization (One Time), Test, Body Execution, Update

		//When initializing variables in the for loop, give them proper variable names instead of just i or j.
		for (int count = 1; count <= 5; count++) {
			//As long as count is less than or equal to 5, count will increment
			System.out.println("THIS STATEMENT WILL REPEAT 5 TIMES");
			System.out.println(count); //Will log 1, 2, 3, 4, 5
		}

		//It is possible to nest for loops: this example will print out a 6 * 9 rectangle of dashes
		for (int line = 1; line <= 6; line++) {
			for (int count = 1; count <= 9; count++) {//Different variables should be used (Else ... Syntax Error)
				System.out.print('-');
			}
			System.out.println();
		}

		//When using for loops, determine the value of preliminary expressions if one is being used in the test block.
		for (int count = 1; count < (14 / 2); count++) { //Placing 14 / 2 in the loop is bad code
			System.out.println(count);
		}
		//Instead of the above for loop:
		int value = 14 / 2; //By getting the value, the 14 / 2 expression won't be evaluated every time in the test block.
		for (int count = 1; count < value; count++) {
			System.out.println(count);
		}

		//No parts of the for loop are required
		for ( ; ; ) {
			System.out.println("Endless loop"); //This statement will loop until the program is terminated.
		}
	}
}
