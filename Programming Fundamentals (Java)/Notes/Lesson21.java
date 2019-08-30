/*
DEFINITIONS:

	- Object-Oriented Programming (OOP): A method of programming based on a hierarchy of classes, and
	well-defined and cooperating objects.

	- Class: A structure that defines data and the methods that work on that data.
		--It represents a program/module, or a template for the creation of new objects
		-- All program data is wrapped in a class, whether it is personally written or imported from the Java API library.

	-Object: An entity that uses the behavior of a class and incorporates state.

	- Field: A variable in an object that is part of its state.

	- Client Program: A program that uses objects created form another class.

	- Abstraction: Hiding the unnecessary details of an object from the user to reduce complexity.

	- Instance Method(Object Method): A method that exists inside each object. This means it isn't static.

	- Implicit Parameter: The object on which an instance method is called.

 */

//Lesson21 is a class that is a program. It isn't focused on creating new objects or being used by other classes.
public class Lesson21 { //Also refer to Point.java

	public static void main(String[] args) {
		//To call upon a class variable: <className>.<varName>
		System.out.println(Point.speciesType);

		//Because speciesType isn't a constant, it can be changed for the current program:
		Point.speciesType = "I am 100% a point.";
		System.out.println(Point.speciesType);

		//It isn't possible to call upon the private variables x and y.
		//System.out.println(Point.x); //EXCEPTION ERROR

		//To call upon a class method: <className>.<methodName>(<optional parameter/s>)
		Point.teachPoint();

		//It isn't possible to call upon any of the non-static methods and variables:
		//System.out.println(Point.point); //EXCEPTION ERROR
		//Point.translate(2, 4); //EXCEPTION ERROR

		//To create an object out of the point class: <className> <varName> = new <className>(<optional parameter/s);
		Point example = new Point(7, 8);

		//Now, the non-static methods and variables are accessible through the object reference variable, 'example':
		System.out.println(example.initialPoint);
		example.translate(10, 10);
		example.printPoint();
	}

}
