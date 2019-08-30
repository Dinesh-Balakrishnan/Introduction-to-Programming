/*
DEFINTIONS:

	- Variable: A piece of the computer's memory that is given a name and type. It can store a value.

	- String Concatenation: Using the + operator between a string and another value to create a string.

	-Precedence: The order in which operators are evaluated in an expression.

	-Operator: Combines multiple values or expressions.

*/
public class Lesson3 {

	public static void main(String[] args) {
		variables();
		variableTypes();
		expressions();
		mixingTypes();
	}

	//Declaration of a variable; variables don't need to be initialized outside a method.
	public static int example;


	public static void variables() {
		//Variable initialization (A value is being stored to the variable)
		example = 4;

		//Two variables can't have the same name. It'll produce a syntax error.
		int x;
		//int x; (PRODUCES SYNTAX ERROR)

		//A variable inside of a method must be initialized before it can be used.
		int anotherExample;
		//Because anotherExample wasn't initialized, the println statement produces a syntax error.
		//System.out.print(anotherExample);
	}

	//A variable has 8 primitive data types and object types
	public static void variableTypes() {
		//A string is an example of an object type:
		String example = "Eclipse doesn't treat string as a keyword because it isn't a primitive data type.";

		//PRIMITIVE DATA TYPES:
		byte byteExample = 0xa; //Represents an 8-bit integer. -128 <= byte <= 127

		short shortExample = 5; //Represents a 16-bit integer. -32_768 <= short <= 32_767

		int intExample = 1_200; //Represents a 32-bit integer. -2^31 <= int <= 2^31 - 1

		long longExample = 400_000_000; //Represents a 64-bit integer. -2^63 <= 2^63 - 1

		float floatExample = 5.67f; //Represents a 32-bit floating point (Decimal numbers)

		double doubleExample = 4.6798; //Represents a 64-bit version of a float.

		char charExample = '1'; //Represents a single Unicode character (16-bit)

		boolean booleanExample = true; // Two values: 'true' or 'false'
	}

	public static void expressions() {
		//Any values that don't have to be computed are literals:
		int literal = 4;

		//EXPRESSIONS:
		int addExpression = 4 + 5; //equals 9

		double subtractExpression = 6.7 - 4.9; //equals 1.8

		double multiplyExpression = 7.0 * 1.5; //equals 10.5

		//NOTE: Integer division by 0 will lead to a runtime error.
		int divideExpression = 5 / 4; //equals 1

		int moduloExpression = 10 % 9; //equals 1

		//PEMDAS still applies! '()', then '^', then '*' '/' '%', then '+' '-'
		int pemdasExample = (5 + 4) + 5 * 4; //equals 180

	}

	public static void mixingTypes() {
		//doubleNotInt is printed out as 0.0 because it is stored as a double.
		double doubleNotInt = 0;
		System.out.println(doubleNotInt);

		//stringNotInt is printed out as string42
		String stringNotInt = "string" + 42;
		System.out.println(stringNotInt);

		//Because of PEMDAS, stringNotInt will print out as 15string42
		stringNotInt = 10 + 5 + "string" + 42;
	}

}
