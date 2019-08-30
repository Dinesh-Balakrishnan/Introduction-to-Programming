import java.util.Arrays;

public class Lesson20 {

	public static void main(String[] args) {
		//It is possible to create an array of arrays by declaring the data type as <type>[][]:
		int[][] example1 = new int[8][6]; //Have to declare the size of each array
		String[][] example2 = {{"Hey","How are you doing?"}, {"Bye", "See you"}}; //Can still declare with constants

		//You can continue the nesting to make 4d or 5d arrays:
		int[][][][][] example3 = new int[8][4][6][4][5];

		//To call upon a specific element in an array:
		example1[3][5] = 157; //Need to declare its exact position in both arrays.

		//To call upon an entire row:
		System.out.println(Arrays.toString(example1[3]));
		//NOTE: It is not possible to call upon a column of data.

		//2d arrays are useful when wanting to deal with a table of data or a 2d plane.
		//In example1, the first array represents rows, while the nested array represents columns.

		//EX:
		int rowLength = example1.length; //Gets the length of the parent array. (Row)
		int columnLength = example1[0].length; //Gets the length of the nested array. (Column)
		for (int row = 0; row < rowLength; row++) {
			for (int column = 0; column < columnLength; column++)
				System.out.printf("%3d", example1[row][column]); //Row/Column format of array
			System.out.println();
		}
		//The first element of the row and column represent the top left corner on a graphical display. This is the point (0, 0).

		//Arrays.toString doesn't work because the nested arrays will still display their hash code:
		System.out.println(Arrays.toString(example1));
	}
}
