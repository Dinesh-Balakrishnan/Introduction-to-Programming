/*
DEFINTIONS:

	- char: A primitive type representing single characters.

	- Casting: A variety of functions that transmit or change data.

 */
public class Lesson19 {

	public static void main(String[] args) {
		casting();
		chars();
	}

	public static void casting() {
		//Casting is converting a data type into another by using the following notation (<convertType>) <value>
		System.out.println((char) 67); //Prints out 'C'

		//Casting has very high priority when being considered in equations:
		System.out.println((double) 3 / 2); //Prints 1.5 (3 was converted to a double first)

		//NOTE: Booleans cannot be involved in data casting as they can only be true or false.

		//Numerical data values can be converted into each other, as long as space permits:
		int floatToInt = (int) 12.456f; //When floats and doubles are converted to integer values, data after the decimal is lost.
		double byteToDouble = (double) 124;
		System.out.println(floatToInt + " " + byteToDouble); //Prints 12 124.0

		//The byte, short, int, long, float, and double data types can be converted into one another unless:
		//short longToShort = (short) 9340593402457;  (SYNTAX ERROR - Out of 'short' range)
		//NOTE: When converting, be careful of the data limitations of data types.

		//The char type and numerical data types can also be switched with each other by using ASCII conversion:
		char doubleToChar = (char) 75.8; //When floats and doubles are converted to integer values, data after the decimal is ignored.
		char intToChar = (char) 456; //If a character is out of the range, [0, 127], the ? character is printed.
		float charToFloat = (float) 'A';
		System.out.println(doubleToChar + " " + intToChar + " " + charToFloat);//Prints K ? 65.0

		System.out.println();
	}

	public static void chars() {
		//You can compare chars with typical boolean operators:
		System.out.println('a' == 'b'); //Prints false
		System.out.println('A' < 'Z'); //Prints true

		//The system prints out true for the '<' operator boolean statement because of each character's ASCII value.
		//Example Mappings: 'A'-65 , 'B'-66 , 'a'-97 , '*'-42

		//Mixing characters and integers causes the result to be an int:
		System.out.println('a' + 100); //Prints 197

		String stringh = "h"; //Double quotes for a string
		char chararacterh = 'h'; //Single quotes for a character.

		//You can't call the same methods that you call upon a string upon a character.
		//characterh.toUpperCase();  (SYNTAX ERROR)

		//IDEA: To make a character lowercase or uppercase, use the space character ' ':
		char a = 'A' + ' ';
		char K = 'k' - ' ';
		System.out.println(a + " " + K); //Prints a K

		//Or..
		a = ('A' + "").toLowerCase().charAt(0);
		K = ('k' + "").toUpperCase().charAt(0);
		System.out.println(a + " " + K); //Prints a K
		//The second method prevents other characters from being altered.
	}
}
