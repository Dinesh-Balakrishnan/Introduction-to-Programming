public class Practice9 {

  public static void main(String[] args) {
      printSquare(1, 5);
      quadratic(3, 4, 5);
      distance(0, 0, 4, 4);
  }

  /*
  Write a method called printSquare that takes in two integer parameters, a min and a max, and prints the
  numbers in the range from min to max inclusive in a square pattern. Each line of the square consists of
  a circular sequence of increasing integers between min and max. Each line prints a different permutation
  of this sequence. The first line begins with min, the second line begins with min + 1, and so on. When the
  sequence in any line reaches max, it wraps around back to min. You may assume the caller of the method will
  pass a min and a max parameter such that min is less than or equal to max.

  Call	printSquare(1, 5); |	printSquare(3, 9); |	printSquare(0, 3); |	printSquare(5, 5);
                           |                     |                     |
  Output	  12345          |       3456789       |         0123        |          5
            23451          |       4567893       |         1230        |
            34512          |       5678934       |         2301        |
            45123          |       6789345       |         3012        |
            51234          |       7893456       |                     |
                           |       8934567       |                     |
                           |       9345678       |                     |
  */

  public static void printSquare (int min, int max) {
      //difference determines the number of rows and characters needed to be printed.
      int difference = max - min;
      //loops for each row.
      for (int rows = 0; rows <= difference; rows++){
          //Loops to print each number.
          for (int num = min; num <= max; num++){
              //output increases by 1 for each row, then also increases per number printed.
              int output = num + rows;
              /*If max is reached in a line, subtracting by the difference variable
              plus 1 resets the number line to be printed. */
              if (output > max){
                  output -= difference + 1;
              }
              System.out.print(output);
          }
          System.out.println();
      }
  }

  /*                              PROBLEM:
  Write a method called quadratic that solves quadratic equations by using a
  quadratic formula and prints out their two roots.
  */

  public static void quadratic(double a, double b, double c) {
      // squareRoot is equal to sqrt(b^2 - 4ac).
      double squareRoot = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
      //addRoot is equal to the entire equation, with adding the squareRoot.
      double addRoot = (-b + squareRoot) / (2 * a);
      //subtractRoot is equal to the entire equation, with subtracting the squareRoot.
      double subtractRoot = (-b - squareRoot) / (2 * a);
      System.out.println("First root = " + addRoot);
      System.out.println("Second root = " + subtractRoot);
  }

  /*                              PROBLEM:
  Write a method called distances that accepts four integer coordinates: x1, y1,
  x2, and y2 in that sense that x1 and y1 are a coordinate pair along with
  x2 and y2 being the other. Using these two pairs, determine the distance
  between them.
  */

  public static double distance (int x1, int y1, int x2, int y2){
      //Simply returns the value of the distance formula.
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

}
