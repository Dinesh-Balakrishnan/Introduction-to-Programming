/*
DEFINITIONS:

	-PrintStream: An object from the Java.io package that lets you print output to a destination, such as a file.

 */

//Importing the PrintStream class:
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;

public class Lesson16 {

	//Notice that the FileNotFound exception has to be thrown because of using the File class
	public static void main(String[] args) throws FileNotFoundException {
		//To create a new PrintStream:
		PrintStream file = new PrintStream(new File("output.txt"));
		//If the file passed to the PrintStream doesn't exist, it will be created; if it exists, it is overwritten.

		//In fact, System.out is a PrintStream object:
		PrintStream console = new PrintStream(System.out); //NO SYNTAX ERROR

		//As a result, the same methods apply to the PrintStream object:
		file.println("This will be outputed to a new file!");
		file.print("Even this! \n");
		file.printf("Of course, I will too!"); //Notice that printf doesn't need parameters

		//It is good practice to close the file once its purpose has been served:
		file.close();
	}
}
