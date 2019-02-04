public class Practice2 {

	public static void main(String[] args) {
		asciiEgg();
		starFigures();
	}

	/*
	Create an ASCII representation of an egg:

	_______
 /       \
/         \
-"-'-"-'-"-
\         /
\_______/


	 */

	public static void asciiEgg() {
		//Simple practice to understand that backslashes need an escape sequence.
		System.out.println("  _______");
		System.out.println(" /       \\");
		System.out.println("/         \\");
		System.out.println("-\"-'-\"-'-\"-");
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}

	/*
	The following output is to be created while also reducing redundancy:

	*****
	*****
	 * *
	  *
	 * *

	*****
	*****
	 * *
	  *
	 * *
	*****
	*****

	  *
	  *
	  *
	*****
	*****
	 * *
	  *
	 * *

	 */

	public static void starFigures() {
		starX();
		System.out.println();
		starX();
		starBulk();
		System.out.println();
		starColumn();
		starX();
	}

	// The starBulk method prints out the 5x2 set of asteriks.
	public static void starBulk(){
		System.out.println("*****");
		System.out.println("*****");
	}

	/* The starX method prints out the set of asteriks that are placed to form
	    the shape of the letter "X". */
	public static void starX(){
		/* Because a bulk appears before every "X" shape,
	        the starBulk method has been called. */
		starBulk();
		System.out.println("�*�*");
		System.out.println("��*");
		System.out.println("�*�*");
	}

	// The starColum method prints out the 1x3 set of asteriks.
	public static void starColumn(){
		System.out.println("��*");
		System.out.println("��*");
		System.out.println("��*");
	}

}
