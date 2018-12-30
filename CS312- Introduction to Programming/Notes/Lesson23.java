/*
DEFINTIONS:

	- Hierarchy: An organizational method used to group data where generic classes are at the top and more specific at the bottom.
	 -- This reduces redundancy between very similar classes (EX: Cashier class and Cook class)

	- Inheritance: Gaining access to parent variables and/or methods

	- Superclass: The parent class that is being extended.

	- Subclass: The child that extends the superclass and inherits its behavior.

	-Method Overriding: Allows a subclass to provide a specific implementation of a method that is alread provided in the superclass.

RULES FOR METHOD OVERRIDING:

	- A method can only be overridden within a subclass.

	- The argument( a.k.a. parameter) list of the subclass' method should be the exact same as the superclass' method.

	- The return type should be the same or sub-type of the superclass' method.

	- The access level cannot be more restrictive.

	- Methods declared as final and/or static cannot be overridden.

 */

//Lesson 23 extends Lesson22. This means it has access to all of the variables and methods in Lesson22
public class Lesson23 extends Lesson22 {
//A class can extend a class, and another class can extend the extended class. This continual chain is called a hierarchy.

	public Lesson23(int id, String name) {
		//The super() keyword accesses the parent's constructor. Lesson22's constructor will be called for Lesson23.
		super(id, name);
		//Now, the id and name are initialized by the parent constructor.
		//If the parent doesn't have a constructor but a even higher parent class does, that constructor will be accessed instead.
	}

	/*Because the superclass has the same exact method, it's method is overridden. Any methods in the superclass that use the
	getName() method will use this current getName() than the superclass' getName(). (SEE OVERRIDING RULES ABOVE)*/
	public String getName() {
		return "Not today.";
	}

	public int getId() {
		//Because the instance variables are private, they cannot be accessed in the child class:
		//return id; //SYNTAX ERROR

		//To access a parent method: super.<methodName>(<parameter/s>);
		int id = super.getId();
		return id;
	}

	public void setId(int id) {
		id *= 10;
		//Private variables and methods can only be accessed through public methods and constructors.
		//The superclass' setId() changes it's private id variable and accesses the private printInfo().
		super.setId(id);
	}

	//When comparing object variables that are assigned to different objects, they will never be equal.
	//There's a partial solution to this:
	public boolean equal(Object obj) {
		//Checks to see whether the other object is the same type as the instance parameter.
		return obj instanceof Lesson23;
	}
}
