public class Practice1 {

	public static void main(String[] args) {
		binaryConversion();
		redundancyInOutput();
	}

	public static void binaryConversion() {
		/*
		Convert each of the following decimal numbers into its equivalent binary number:

			6    |  Answer: 110
			44   |  Answer: 101100
			72   |  Answer: 1001000
			131  |  Answer: 10000011

		Convert each of the following binary numbers into its equivalent decimal number:

			100     |  Answer: 4
			1011    |  Answer: 11
			101010  |  Answer: 42
			1001110 |  Answer: 78
		 */
	}

	/*
	The following output is to be created while also reducing redundancy:

	//////////////////////
	|| Victory is mine! ||
	\\\\\\\\\\\\\\\\\\\\\\
	|| Victory is mine! ||
	\\\\\\\\\\\\\\\\\\\\\\
	|| Victory is mine! ||
	\\\\\\\\\\\\\\\\\\\\\\
	|| Victory is mine! ||
	\\\\\\\\\\\\\\\\\\\\\\
	|| Victory is mine! ||
	\\\\\\\\\\\\\\\\\\\\\\

	 */

	public static void redundancyInOutput() {
		System.out.println("//////////////////////");
		/* Further repetition would've required stacked methods in order to
        reduce redundancy created by excessive amount of calling of the
        repeatStatements method. */
		repeatStatements();
		repeatStatements();
		repeatStatements();
		repeatStatements();
		repeatStatements();
	}

	/* The repeatStatements method is created so that the the two repeating
    lines wouldn't be coded more than once.*/
	public static void repeatStatements(){
		System.out.println("|| Victory is mine! ||");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}
}
