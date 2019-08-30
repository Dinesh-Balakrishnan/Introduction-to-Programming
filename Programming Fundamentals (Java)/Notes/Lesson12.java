import java.util.Scanner;

/*
DEFINTIONS:

	-Definite Loop: Executes a known number of times.
		-- For loops that initialize and handle a variable only within the header are definite loops
		-- EX: Printing "Hello" 10 times

	-Indefinite Loop: Executes an unknown number of times.
		-- While loops are mostly indefinite loops
		-- EX: Prompting the user until they type a non-negative number

	-Sentinel: A value that signals the end of user input.

	-Sentinel Loop: A loop that repeats until a sentinel value is seen.

 */
public class Lesson12 {

	public static void main(String[] args) {
		whileLoop();
		doWhileLoop();
	}

	public static void whileLoop() {
		//A while loop checks a conditional and repeats code until the conditional becomes true:
		//Syntax: while(condition) {statement/s;}

		int value = 200; //Value is initialized before the while loop
		while(value != 4) { //Until the condition is met...
			System.out.println(value); //These two statements will continuously execute.
			value--;
		}
		System.out.println();

		//In a sense, the while loop resembles a for loop: (It has initialization, test, and update)
		int condition = 4; //Initialization
		while (condition <= 10) { //Test
			System.out.println("Still looping"); //Loop code
			condition++; // Update
		}
	}

	public static void doWhileLoop() {
		//A do-while loop does the same thing as the while loop, but executes the body once first:
		//Syntax: do {statement/s;} while(condition);

		Scanner keyboard = new Scanner(System.in);
		String username = "";
		do { //We want the message to print at least once and receive user input
			System.out.print("Please enter a username greater than 8 characters: ");
			username = keyboard.next();
			keyboard.nextLine();
		} while (username.length() <= 8); //Pay attention to the semi-colon needed at the end
	}
}
