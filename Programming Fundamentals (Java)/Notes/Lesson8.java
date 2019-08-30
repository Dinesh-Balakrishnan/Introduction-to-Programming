/*
DEFINTIONS:

	- Java Standard Library (Java Class Library): A set of dynamically loadable libraries that a Java application can
	load up any time.

	-Type Cast: Conversion from one type to another.

 */

public class Lesson8 {

	public static void main(String[] args) {
		mathClass();
		typeCasting();
	}

	public static void mathClass() {
		//Commonly used Math variables:
		double pi = Math.PI;
		double e = Math.E; //(Euler's Number)

		//Commonly used Math methods:
		//To get the absolute value of a number:
		int getAbsoluteValue = Math.abs(-4); //Equals 4 (Can be of type int)

		//To get the next .0 value closest to a number:
		double roundUp = Math.ceil(4.4); //Equals 5.0

		//To get the previous .0 value closest to a number:
		double roundDown = Math.floor(4.6); //Equals 4.0

		//To get the logarithm of a number (Base 10):
		double logPower = Math.log10(10); //Equals 1

		//To get the larger of two values:
		int largerNumber = Math.max(4, 5); // Equals 5 (Can be of type int)

		//To get the smaller of two values:
		int smallerNumber = Math.min(4, 5); // Equals 4 (Can be of type int)

		//To get the power of a number (param1^param2):
		double power = Math.pow(2, 2); // Equals 4.0

		//To get a random number:
		double random = Math.random(); // Equals a random double from (0, 1].

		//To round a number to the closest .0 value:
		double round = Math.round(4.5); //Equals 5.0

		//To get the square root of a value:
		double squareRoot = Math.sqrt(4); //Equals 2.0
	}

	public static void typeCasting() {
		//Syntax for type casting: (newType) expression
		int intCasting = (int) 6.0; //Equals 6

		//Casting has a high precedence
		//EX (see below): 19 is converted to 19.0, then divided by 5
		double precedenceExample = (double) 19 / 5; //Equals 3.8
		//EX (see below) 19 / 5 == 3, then cast to the double 3.0
		double expressionFirst = (double) (19 / 5);

		//There are methods to change a variable's type without type casting; for example:
		String notAnInt = "" + 4; // Equals "4"
		double doubleConversion = 1.0 * 4; // Equals 4.0
	}
}
