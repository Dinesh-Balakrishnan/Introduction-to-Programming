public class Practice5 {

	public static void main(String[] args) {
		numberTargeting();
		waveNumbers();
		fibonacci();
	}

	/*
	Use for loops to create the following output:

	         |         |         |         |         |         |
	123456789012345678901234567890123456789012345678901234567890

	*/
	public static void numberTargeting() {
		final int NUMBER_COUNT = 60;
		final int RESET = 10;
		int numberSets = NUMBER_COUNT / RESET;

		//Repeats for each set of 10 integers.
		for(int set = 0; set < numberSets; set++)
			//For each set, this pattern is printed out.
			System.out.print("         |");
		System.out.println();
		//The for loop then repeats for the number set on the next line
		for (int count = 1; count <= NUMBER_COUNT; count++)
			System.out.print(count % RESET); //The % RESET expression helps loop through the numbers.
		System.out.println();
		System.out.println();
	}

	/*
	Use for loops to produce the following output:

	----------------------------------------
	_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
	1122334455667788990011223344556677889900
	----------------------------------------

	*/

	public static void waveNumbers() {
		//Performing mathematical operations before printing to the console.
		final int ROW_LENGTH = 40;
		int waveCount = ROW_LENGTH / 4;
		int numberSets = ROW_LENGTH / 2;
		//Prints the first row of dashes
		print(ROW_LENGTH, "-");
		//Prints the repeating ASCII wave structure
		print(waveCount, "_-^-");
		//Prints out the repeating number sequence.
		for (int number = 1; number <= numberSets; number++) {
			int displayNum = number % waveCount;
			System.out.print(displayNum + "" + displayNum);
		}
		System.out.println();
		//Prints the last row of dashes
		print(ROW_LENGTH, "-");
	}

	//The print method prints out a symbol the specified number of times.
	public static void print(int total, String symbol) {
		for (int count = 1; count <= total; count++)
			System.out.print(symbol);
		System.out.println();
	}

	/*
	Write code that prints out the first 12 Fibonacci numbers:

	1 1 2 3 5 8 13 21 34 55 89 144

	 */
	public static void fibonacci() {
		final int LIST_COUNT = 12;
		int print = 1;
		int storage = 0;
		for (int count = 1; count <= LIST_COUNT; count++) {
			System.out.print(print + " ");
			/* Every loop, the previous number must be added onto the current number,
		    but the current number needs to be stored for next time. */

			/* temp stores the previous number that needs to be added onto
		     the current number to produce the next output. */
			int temp = storage;
			/* storage now stores the current number, which will become the number
		    to be added on the next iteration of the for loop. */
			storage = print;
			print += temp;
		}
		System.out.println();
	}

	/*
	Create a class called SlashFigure that uses one public static final constant
	to create an ASCII art that depends on the value of the constant. A couple of
	size examples are shown:

	Size 4 -
	!!!!!!!!!!!!!!
	\\!!!!!!!!!!//
	\\\\!!!!!!////
	\\\\\\!!//////

	Size 7 -
	!!!!!!!!!!!!!!!!!!!!!!!!!!
	\\!!!!!!!!!!!!!!!!!!!!!!//
	\\\\!!!!!!!!!!!!!!!!!!////
	\\\\\\!!!!!!!!!!!!!!//////
	\\\\\\\\!!!!!!!!!!////////
	\\\\\\\\\\!!!!!!//////////
	\\\\\\\\\\\\!!////////////

	*/

	public static void slashFigure() {
		final int SIZE = 4;
		for (int row = 1; row <= SIZE; row++) {
			//Finding out how many exclamation marks exist for the current row.
			int neededExclamation = (SIZE - row) * 4 - 2;
			//Reuses the print method for the waveNumbers problem to print out the parts per row.
			print(row, "\\\\");
			print(neededExclamation, "!");
			print(row, "//");
			System.out.println();
		}
	}
}
