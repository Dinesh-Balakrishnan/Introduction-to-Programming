public class Point { //Part of Lesson21

	//The three variables (x, y, and point) are fields. They can vary depending on the object.

	//x and y are private variables. As a result, they cannot be accessed by other classes.
	private int x;
	private int y;

	//point is a public variable that can be accessed by other classes. It isn't static because it depends on the state of an object.
	public String initialPoint;

	//speciesType is a variable that doesn't depend on the instance of an object. As a result, it should be static.
	public static String speciesType = "I am a point";

	//This is a constructor, covered in a later lesson.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		initialPoint = "(" + x + ", " + y + ")";
	}

	/*Because translate() wouldn't work unless an object was created with the initialization of the x and y fields,
	 it shouldn't be a static method. To use this method, the user must create an object.*/
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}

	//pointPoint() follows the same idea as translate()
	public void printPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}

	//Because teachPoint will do the same thing regardless of the situation, it shall be a static method.
	public static void teachPoint() {
		System.out.println("A point refers to an element of some set called a space.");
		System.out.println("A point is a primitive notion upon which geometry is built.");
		System.out.println("It cannot be defined in terms of previously defined objects");
	}
}
