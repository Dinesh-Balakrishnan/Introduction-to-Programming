/*
DEFINITIONS:

	- Absolute Path: Specifies a location, regardless of the current working directory.
	  This is done by starting from the root directory.
	  	-- EX: C:/Documents/smith/hw6/input/data.csv

	- Relative Path: Specifies a location in relation to the current working directory.
		-- input.kinglear.txt

	- Exception: An object representing a runtime error.
		-- Dividing by 0.
		-- Calling on a substring whose index parameters are too large for a string.
		-- Reading the wrong value from a scanner.
		-- Trying to read a file that doesn't exist.

	- Checked Exception: An error that is handled by the program.
		-- Done by using the 'throws' keyword.

	- FileNotFoundException: Occurs if the file at the specified location doesn't exist.

	- NoSuchElementException: Occurs if the code tries to get a line or token of input past the end of a file.

	- InputMismatchException: Occurs if a token is treated as a wrong type.
		-- EX: Next token is "hello", and this statement is called - double value = sc.next();  (string != double)

 */

//Importing the File class for the Scanner class
import java.io.File;
//Importing the FileNotFoundException error clause.
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson15 {

	//Parent files must also throw the exception (See fileCreation()):
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(fileCreation());
		readFile(sc);
	}

	/*Sometimes, the complier won't run because the user hasn't dealt with potential problems that could occur
	 when running the program. The throws exception is a simple way to stop this.*/
	public static File fileCreation() throws FileNotFoundException {
		/*The FileNotFoundException is thrown in the method header, which means the compiler won't say anymore that
		a potential missing file could throw an error and stop the program. */

		//To easily find what the current working directory is (In case one forgot):
		System.out.println("Working directory: " + System.getProperty("user.dir"));

		//To create a new File object:
		File f = new File("sampledoc.txt"); //Parameter is of type string, USE the file extension

		//It is simple to just delete the file from the disc by using:
		// f.delete();

		//To get the name of the file:
		System.out.println("File Name: " + f.getName());

		//To get its length in bytes:
		System.out.println("File Size: " + f.length() + " bytes");

		//It is important to still check whether the file exists, or the rest of the program will not properly function:
		if (f.exists() && f.canRead()) { //Checks whether the file exists and can be read from.
			return f;
		}
		//It's simple to throw in a personally created error by following this syntax:
		throw new Error("The file is missing or corrupted.");
		//The program will throw this error if the inputed file is missing or doesn't have readable data.
	}

	public static void readFile(Scanner sc) {
		while (sc.hasNextLine()) { // .hasNextLine() checks to see whether the file has another newline character.

			//In order to read data from a line of information, another scanner needs to be created for the line.
			Scanner line = new Scanner(sc.nextLine()); //.nextLine gets all information up to the newline character.

			while(line.hasNext()) { // .hasNext() checks for whitespace or a newline character

				if (line.hasNextInt()) { // .hasNextInt() checks to see whether the next token can be an int.
					int example = line.nextInt(); //Consumes the next token and returns it as an integer.
					System.out.println("Integer - " + example);

				} else if (line.hasNextDouble() ) { // .hasNextDouble() checks to see whether the next token can be a double.
					double example = line.nextDouble(); //Consumes the next token and returns it as a double.
					System.out.println("Double - " + example); //NOTE: Ints can also be read as doubles.

				} else {
					String example = line.next(); //Consumes the next token and returns it as a string.
					System.out.println("String - " + example);//NOTE: Doubles and ints can also be read as strings.
				}

			}
		}
	}
}
