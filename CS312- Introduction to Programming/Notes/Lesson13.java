//Statement to use the Java Random Class
import java.util.Random;

public class Lesson13 {

	public static void main(String[] args) {
		byteConversion();
		randomClass();
	}

	public static void byteConversion() {
		/*
		Byte Conversion Values:

			- Bit (Binary Digit): 1 or 0

			- Nibble: 4 bits

			- Byte: 8 bits

			- Kilobyte: 1024 bytes (2^10 bytes)

			- Megabyte: 1,048,576 bytes (2^20 bytes)

			- Gigabyte: 1,073,741,824 bytes (2^30 bytes)

		 */
	}

	public static void randomClass() {
		//To create the random object:
		Random rnd = new Random();

		//Generate a random integer:
		System.out.println(rnd.nextInt()); //For example, it printed out -1295082079 one time.

		//Generate a random integer from [0, max):
		System.out.println(rnd.nextInt(5)); //Prints out values 0, 1, 2, 3, and 4.

		//Generate a random double from [0.0, 1.0):
		System.out.println(rnd.nextDouble()); //Prints out any value from 0.0 to 1.0, excluding 1.0

		//To generate an integer from [min, max]:
		//(Syntax: rnd.nextInt(rangeSize) + min; rangeSize = max - min + 1;
		//To generate a value from 10 to 100:
		int min = 10;
		int max = 100;
		int range = max - min + 1;
		System.out.println(rnd.nextInt(range) + min);
	}
}
