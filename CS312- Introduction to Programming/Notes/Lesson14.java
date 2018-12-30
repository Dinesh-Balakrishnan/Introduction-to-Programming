/*
DEFINITIONS:

	- Boolean: A logical type whose values are true and false.
		-- Test cases in if, for, while, and do-while loops are boolean expressions.

 */
public class Lesson14 {

	public static void main(String[] args) {
		boolean exampleBoolean = false;
		isTrueBAD(exampleBoolean);
		isTrueGOOD(exampleBoolean);

		int exampleInt = 14;
		boolean isEven = isEvenBAD(exampleInt);
		isEven = isEvenGOOD(exampleInt);
	}

	public static void isTrueBAD(boolean isTrue) {
		if (isTrue == true) { //The problem lies in checking whether the value equals true.
			System.out.println("This boolean has a value of true");
		} else {
			System.out.println("This boolean has a value of false");
		}
		//Problem: if true == true, execute (EXTRA WORK)
	}

	public static void isTrueGOOD(boolean isTrue) {
		if(isTrue) { //The boolean value already stores the conditional that can be checked in the if statement
			System.out.println("This boolean has a value of true");
		} else {
			System.out.println("This boolean has a value of false");
		}
		//Solution: if true, execute
	}

	public static boolean isEvenBAD(int number) {
		if (number % 2 == 0) { //The statement is correct here....
			return true; //But the if/else statement isn't even required.
		}
		return false;
		//Problem: If statement == true, return true. If statement == false, return false. (EXTRA WORK)
	}

	public static boolean isEvenGOOD(int number) {
		return number % 2 == 0; //The boolean statement can just be returned.
		//Solution: just return the statement
	}

	public static void deMorgansLaw() {
		//De Morgan's Law is useful for finding the negated version of a boolean test.
		//Two Rules: !(a && b) == !a || !b,  !(a || b) == !a && !b

		//Example:
		double grade = 2.0;
		boolean mischevious = true;
		if (grade <= 3.0 || mischevious) { //The mischevious students and ones who have bad grades receive the positive message.
			System.out.println("You've been a great student this year!");
		} else {//The good student receives the bad message
			System.out.println("You've been a terrible student this year!");
		}

		//We can fix this by reversing the boolean expression:
		if (grade > 3.0 && !mischevious) {
			System.out.println("You've been a great student this year!");
		} else {//The good student receives the bad message
			System.out.println("You've been a terrible student this year!");
		}

		/*REVERSED EXPRESSIONS:
		 	a  < --- > !a
		 	&& < --- > ||
		 	>  < --- > <=
		 	<  < --- > >=
		 	== < --- > !=
		 */
	}
}
