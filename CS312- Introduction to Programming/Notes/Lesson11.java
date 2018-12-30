import java.util.Scanner;

/*
DEFINTIONS:

	-String: An object storing a sequence of text characters.

	-Index Notation: A notation to find data by organizing it in a list-like order.

 */
public class Lesson11 {

	public static void main(String[] args) {
		stringFunctionality();
		stringComparison();
		stringMethods();
	}

	public static void stringFunctionality() {
		//Strings can be created just like any other object.
		String objExample = new String("Hello!");

		//But ... it is more efficient to just declare the value within quotation marks
		String stringLiteralExample = "Hello!";

		//Strings are character arrays with much more functionality:
		String declaration = "Hello!";
		char[] howStringsAreStored = {'H', 'e', 'l', 'l', 'o', '!', };

		//Because of this, they follow the same indexing as arrays. The 'H' in "Hello!" is at the 0th index.
		System.out.println(declaration.charAt(0)); //Prints H
		System.out.println(declaration.charAt(4)); //Prints o
		System.out.println(declaration.charAt(5)); //Prints !

		//Even the scanner's nextLine and next methods read input as strings.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a statement: ");
		String firstToken = keyboard.next(); //No syntax error
		String remainingTokens = keyboard.nextLine(); //Not here either
		System.out.println("You said: " + firstToken + " " + remainingTokens);
		System.out.println();
	}

	public static void stringComparison() {
		//You can compare primitives by using the == sign:
		System.out.println('a' == 'a'); //Prints true

		//You shouldn't compare objects with ==, and string is an example:
		System.out.println("Dog".equals("Dog")); //Right way to compare strings. Prints true

		//You can compare two strings while also ignoring the difference in upper and lower case:
		System.out.println("Dog".equalsIgnoreCase("dog")); //Prints true

		//To check whether a string starts with certain characters:
		System.out.println("Dog".startsWith("do")); //Prints false

		//To check whether a string ends with certain characters:
		System.out.println("Dog".endsWith("og")); //Prints true

		//To check whether a string contains certain characters in order:
		System.out.println("Doggo".contains("oggo")); //Prints true

		System.out.println();
	}

	public static void stringMethods() {
		//COMMONLY USED STRING METHODS:

		//indexOf(str) returns the index where the start of the given string appears. If it isn't there, it returns -1.
		System.out.println("Superman".indexOf("man")); //Prints 5
		System.out.println("Rottenman".indexOf("Super")); //Prints -1

		//length() returns the number of characters in the string.
		System.out.println("Superman".length()); //Prints 8

		//replace(str1, str2) replaces occurrences of str1 with str2.
		System.out.println("abababababababababa".replace("ba", "Aa")); //Prints aAaAaAaAaAaAaAaAaAa

		//substring(index1, index2) returns the part of the string that is within the given index, excluding the last character.
		//If one parameter is provided, substring(index), all characters from the index to the end of the string are returned.
		System.out.println("Superman".substring(2, 5)); //Prints per
		System.out.println("Superman".substring(4)); //Prints rman

		//toLowerCase() and toUpperCase() change the case of all characters in the provided string:
		System.out.println("Superman".toLowerCase()); //Prints superman
		System.out.println("Superman".toUpperCase()); //Prints SUPERMAN
	}
}
