/*
DEFINITIONS:

	- Program: A set of instructions that are to be carried out by a computer.

	- Program Execution: The act of carrying out the instructions contained in a program.
		-- This is done by feeding the instructions to the CPU.

	- Programming Language: A systematic set of rules used to describe computations, generally in a format that is
	readable and editable by humans.
		-- Java is an example of a programming language.

	- Low Level Language: A programming language that provides some to no simplification and is closer to how the
	computer actually processes data.
		-- The lowest level language is machine code, which is a sequence of bits.

	- High Level Language: A programming language that is designed to simplify programming by abstracting elements of
	code from low-level languages. This makes the code simpler and easier to read.
		-- Before being processed by the CPU, high-level code is converted into low-level code.

	- Compiler: A program that converts commands from high-languages to machine code.
		-- Compiling is translating a program from a high-level language to a lower-level language.

	- Byte Code: The Java compiler transforms the code into a code format called byte code, which is converted into
	machine language for the CPU on a Java Virtual Machine (JVM).
		-- A JVM is utilized in order to support the difference in machine types.

	- Source Code: The set of instructions in a program.

*/

/*The file name must match the class name, or else a compile error will occur. This is a necessity because
  the same file can have multiple classes.	*/
public class Lesson1.java {

	//main is the parent method that a compiler looks for when executing code.
	public static void main(String[] args) { //main is a method
		namingConventions(); //namingConventions(); is a statement.
		stringSyntax();
	}

	public static void namingConventions() {
		//When naming a method or a variable, use camelCase.
		int exampleVariable = 4;

		//When values or statements are declared as final, use SCREAMING_SNAKE_CASE.
		final int EXAMPLE_VARIABLE = 4;

		//Keywords, such as 'final', 'public', and 'int' cannot be used as identifiers.
		// int final = 4; (Returns a Syntax Error because variable name doesn't exist)

		//Identifiers are also case sensitive. exampleVariable does not equal ExampleVariable
		//ExampleVariable++; (Returns a Syntax Error because the computer doesn't know what it's referring to.)
	}

	public static void stringSyntax() {
		//A string is a sequence of characters.
		String example = "This is a string";

		//To print out data to the console, use System.out.println()
		System.out.println(example); //Prints out "This is a string"

		//Escape Sequence: A special sequence of characters used to represent a special character in a string.
		System.out.println("tab ->\t<- tab"); // Tab Character: \t (Like pressing tab)
		System.out.println("Line One\nLine Two"); // Next Line Character: \n (Like pressing enter)
		System.out.println("\""); // Quotation Character: \" (Needed to not confuse with opening and closing quotes)
		System.out.println("\\"); // Backlash Character: \\ (A single backlash may lead to a different escape sequence)
	}
}
