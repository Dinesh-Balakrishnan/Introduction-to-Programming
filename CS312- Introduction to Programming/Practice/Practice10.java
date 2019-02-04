public class Practice10 {

  public static void main(String[] args) {
    logicExpressions();
    System.out.println(repl("hello", 3));
    printTriangleType(3, 4, 5);
    System.out.println(quadrant(4.0, -3.6));
  }

  public static void logicExpressions() {
    /*
    Given that ...

    int x = 4;
    int y = -3;
    int z = 4;

    ... evaluate the following expressions:

    x == 4	                        | Answer: true

    x == y                          | Answer: false

    x == z                          | Answer: true

    y == z                          | Answer: false

    x + y > 0                       | Answer: true

    x - z != 0                      | Answer: false

    y * y <= z                      | Answer: false

    y / y == 1                      | Answer: true

    x * (y + 2) > y - (y + z) * 2   | Answer: true
    */
  }

  /*                             PROBLEM:
  Write a method named repl that accepts a String and a number of repetitions as
  parameters, then returns the String concatenated that many times. An example
  is shown below:

  repl("hello", 3);
  "hellohellohello"

  */

  public static String repl (String input, int repetition) {
      //If the repetition is less than or equal to 0, no string is required to be returned.
      if (repetition <= 0) {
          return "";
      } else {
          //Creates the final output string
          String concatenation = "";
          //loops for the amount of times the string needs to be concatenated.
          for (; repetition > 0 ; repetition--){
              concatenation += input;
          }
          //Returns the concatenated string.
          return concatenation;
      }
  }

  /*                             PROBLEM:
  Write a method called printTriangleType that accepts three integer arguments
  representing the lengths of the sides of a triangle and then prints out whether
  the triangle is scalene, obtuse, or equilaterial.
  */

  public static void printTriangleType(int s1, int s2, int s3){
      //If all sides equal each other, the triangle is equilateral.
      if (s1 == s2 && s2 == s3){
          System.out.print("equilateral");
      //If none of the sides equal each other, the triangle is scalene.
      } else if (s1 != s2 && s2 != s3 && s1 != s3) {
          System.out.print("scalene");
      //If a triangle isn't equilateral or scalene, then it has to be isosceles.
      } else {
          System.out.print("isosceles");
      }
  }

  /*                             PROBLEM:
  Write a static method called quadrant that takes in a pair of real numbers
  representing an (x, y) coordinate.  Using the coordinate, return the number
  of the quadrant it is located in.
  */

  public static int quadrant (double x, double y){
      //If x and y is positive, the top-right (1) quadrant is the location.
      if (x > 0 && y > 0) {
          return 1;
      //If x is negative while y is positive, the top-left (2) quadrant is the location.
      } else if (x < 0 && y > 0) {
          return 2;
      //If x and y are negative, the bottom-left (3) quadrant is the location.
      } else if (x < 0 && y < 0 ) {
          return 3;
      //If x is positive while y is negative, the bottom-right (4) quadrant is the location.
      } else if (x > 0 && y < 0 ) {
          return 4;
      }
      /*If none of the statements work, that means that either x or y equals 0.
      This means that the coordinates aren't on any specific quadrant and 0
      is returned. */
      return 0;
  }
}
