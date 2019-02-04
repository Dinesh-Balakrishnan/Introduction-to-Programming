public class Practice6 {

  public static void main(String[] args) {
    printNumbers(15);
    printPowersOf2(3);
    printPowersOfN(5, 6);
    System.out.println(cylinderSurfaceArea(2, 2));
  }

  /*
  Create a method called printNumbers that accepts a number as a parameter and
  produces the following sequence of outputs depending on the number. Assume
  that the values passed to the method are greater than or equal to 1.

  printNumbers(15);
  [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15]

  printNumbers(5);
  [1] [2] [3] [4] [5]

  */

  public static void printNumbers(int length){
      for (int i = 1; i <= length; i++){
          System.out.print("[" + i + "] ");
      }
  }

  /*
  Write a method called printPowersOf2 that prints each power from 2^0 to the
  maximum inputted power. The exponent passed to printPowersOf2 will be 0 or
  greater.

  Example Inputs:
  printPowersOf2(3);
  1 2 4 8

  printPowersOf2(10);
  1 2 4 8 16 32 64 128 256 512 1024

  */

  public static void printPowersOf2(int power){
      /* Because Math.pow() cannot be used, latestNum is used to gradually
      increase power values. This way, the * operator can be used instead. */
      int latestNum = 1;
      for (int i = 0; i <= power; i++){
          System.out.print(latestNum + " ");
          latestNum *= 2;        
      }
  }

  /*
  Write a method called printPowersOfN that takes in a base (N) and exponent.
  Then the method should print each power from N^0 to the maximum inputted power.
  The exponent passed to printPowersOfN will be 0 or greater.

  Example Inputs:
  printPowersOfN(4, 3);
  1 4 16 64

  printPowersOfN(5, 6);
  1 5 25 125 625 3125 15625

  printPowersOfN(-2, 8);
  1 -2 4 -8 16 -32 64 -128 256

  */

  public static void printPowersOfN(int power, int length){
      //Same as as the printPowersOf2 method.
      int latestNum = 1;
      for (int i = 0; i <= length; i++){
          System.out.print(latestNum + " ");
          latestNum *= power;        
      }
  }

  /*
  Write a method called cylinderSurfaceArea that takes in the radius and height
  of a cylinder and returns its surface area.
  */

  public static double cylinderSurfaceArea(double radius, double height){
      // Introduces the concept of Math.PI.
      return 2 * Math.PI * radius * (radius + height);
  }
}
