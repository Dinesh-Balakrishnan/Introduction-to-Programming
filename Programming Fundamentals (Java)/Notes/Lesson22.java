/*
DEFINTIONS:

	- Encapsulation: Hiding implementation details from clients.
		-- This automatically forces abstraction..
		-- It separates the behavior from the state of an object and protects the integrity of the object's data

	- Shadowing: Occurs when two variables with the same name exist within the same scope.
		-- This is syntactically incorrect unless one of these variables is a field.

 */
public class Lesson22 {

	//id and name are private fields that cannot be accessed outside the class.
	private int id;
	private String name;

	//This is a constructor. It is used to initialize an object. (NOTE: No return keyword is required, must use class name)
	public Lesson22(int id, String name) {
		//When variable name conflict occurs, it is easy to refer to the personal variables of an object by using 'this':
		this.id = id;
		this.name = name;
		//Just like variables, personal methods can be called in the same way. |  EX: this.getId()
		//To call upon the object: Lesson22 example = new Lesson22(2456940, "Dinesh");
	}

	//Constructors initialize an object depending on the parameters passed in. As a result, many constructors can exist:
	public Lesson22() {
		/*When multiple constructors exist, another constructor can be called by using 'this()'. The constructor
		 that has the same parameter requirements will be called*/
		this(0000000, "UNNAMED");
		//The this() method must be called before anything else happens in the current constructor.
		//To call upon the object: Lesson22 example = new Lesson22();
	}

	//If accessing the private fields is truly needed, "accessors" and "mutators" should be used:

	//Accessors:

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	//Mutators:

	public void setId(int id) {
		this.id = id;
		printInfo();
	}

	public void setName(String name) {
		this.name = name;
		printInfo();
	}

	/*A method should only be private when it is personally used by the object or class and isn't required to be
	 accessed by the user. */
	private void printInfo() {
		System.out.println("The current user is: " + name);
		System.out.println("User ID: " + id);
	}
}
