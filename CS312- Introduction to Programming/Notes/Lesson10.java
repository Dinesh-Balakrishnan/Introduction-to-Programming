
public class Lesson10 {

	public static void main(String[] args) {
		printfBasics();
		printfFormating();
	}

	public static void printfBasics() {
		//Firstly, println is print with a newline character attached at the end.
		System.out.println("Same statement");
		System.out.print("Same statement\n");
		System.out.println(); //Use a blank println statement if a space is needed between printing statements.

		//printf is very helpful because it can format data before printing it out to the console.
		//General syntax: System.out.printf("format string", parameters);

		int exampleInt = 4444;
		//%d is a placeholder for an integer.
		System.out.printf("%d \n", exampleInt); // Prints out "4444"

		//%f is a placeholder for a real number. (Essentially decimal numbers)
		System.out.printf("%f \n", 4.56); //Prints out "4.65"

		String exampleString = "Four thousand, four hundred, forty-four";
		//%s is a placeholder for a string.
		System.out.printf("%s \n", exampleString); //Prints out "Four thousand, four hundred, forty-four"

		//Combining multiple values: (NOTE: It is important to place the parameters in order they appear in the string)
		System.out.printf("%s in integer form is %d \n", exampleString, exampleInt);
		//Prints out "Four thousand, four hundred, forty-four in integer form is 4444"
		System.out.println();
	}

	public static void printfFormating() {
		int password = 349837405;
		String detailHeader = "--DETAILS--";

		//It is possible to make a value x characters wide:
		System.out.printf("%40s \n", detailHeader); //Prints out "                             --DETAILS--"

		//The password variable length is longer than the specified value, so no change will occur:
		System.out.printf("The password is: %5d \n", password); //Prints out "The password is: 349837405"

		double pi = Math.PI;
		//You can round a value to the specified decimal place in printf:
		System.out.printf("Pi rounded to the tenth's place is: %.1f \n", pi);
		//Prints out "Pi rounded to the tenth's place is: 3.1"

		//You can space out the value at the same time:
		System.out.printf("Pi rounded to the thousandth's place is: %8.3f \n", pi);
		//Prints out "Pi rounded to the thousandth's place is:    3.142"

		//Because printf doesn't include a newline character at the end, it is important to manually add it.
	}
}
