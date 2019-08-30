public class Practice4 {

	public static void main(String[] args) {
		loopingSquares();
		asteriskTriangle();
		numberTriangle();
		reverseNumberTriangle();
		printDesign();
	}

	/*
	Write a for loop that produces the following output without the * operator:

	1 4 9 16 25 36 49 64 81 100

	 */

	public static void loopingSquares() {
		/* While the most obvious pattern seen between the numbers is that they
	    are the squares of numbers starting from 1 to 10, another pattern exists.
	    Each next number increases by an odd number value down the list in order.
	    First value increases by 1, the next by 3, then 5, and so on. This is
	    represented by the equation below. */
		final int DISPLAY_COUNT = 10;
		for(int increment = 0, output = 0; increment < DISPLAY_COUNT; increment++) {
			output += 1 + increment + increment;
			System.out.print(output + " ");
		}
		System.out.println();
	}

	/*
	Write for loops that produces the following output:

	 *
	 **
	 ***
	 ****
	 *****
	 */

	public static void asteriskTriangle() {
		final int ROWS = 5;
		for (int row = 1; row <= ROWS; row++) {
			//By setting asteriskCount equal to the row, the asterisk count increases as the row goes down.
			for (int asteriskCount = row; asteriskCount > 0; asteriskCount--)
				System.out.print("*");
		System.out.println();
		}
	}

	/*
	Write for loops that produces the following output:

	1
	22
	333
	4444
	55555
	666666
	7777777

	*/

	public static void numberTriangle() {
		final int ROWS = 7;
		for (int row = 1; row <= ROWS; row++) {
			for (int numberCount = row; numberCount > 0; numberCount--)
				//Same as asteriskTriangle() [Above], but prints the row count instead of an asterisk.
				System.out.print(row);
		System.out.println();
		}
	}

	/*
	Write for loops that produce the following output:

	    1
	   22
	  333
	 4444
	55555

	*/

	public static void reverseNumberTriangle() {
		final int ROWS = 5;
		for (int row = 1; row <= ROWS; row++) {
			//This for loop creates the spaces for the the triangle.
			for (int spaces = ROWS - row; spaces > 0; spaces--)
				System.out.print(" ");
			//After the spaces are printed, the numbers are printed.
			for (int numberCount = row; numberCount > 0; numberCount--)
				System.out.print(row);

			System.out.println();
		}
	}

	/*
	Write a method called printDesign using for loops that produces
	the following output:

	-----1-----
	----333----
	---55555---
	--7777777--
	-999999999-

	*/

	public static void printDesign() {
		//The final ints describe the specification of the design.
		final int LINE_SIZE = 11;
		final int ROWS = 5;
		for (int row = 1, num = 1; row <= ROWS; row++, num += 2) {
			int dashSet = (LINE_SIZE - num) / 2;
			print(dashSet, "-"); //Prints out first set of dashes.
			print(num, num + ""); //Then the numbers.
			print(dashSet, "-"); //Lastly, the second set of dashes.
			System.out.println();

		}
	}

	//The print method simply prints out the desired symbol the specified amount of times.
	public static void print(int total, String symbol) {
		for (int count = 1; count <= total; count++)
			System.out.print(symbol);
	}
}
