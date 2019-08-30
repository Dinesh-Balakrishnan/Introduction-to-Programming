public class Practice15 {

  public static void main(String[] args) {
    randomX();
    randomWalk();
  }
  /*
  Write a method named randomX that keeps printing lines, where each line contains a
  random number of x characters between 5 and 19 inclusive, until it prints a line
  with 16 or more characters. Notice in the example that the last line has 17 x characters.

    xxxxxxx
    xxxxxxxxxxxxx
    xxxxxx
    xxxxxxxxxxx
    xxxxxxxxxxxxxxxxx

  */

  public static void randomX () {
    Random number = new Random();
    int random = 0;
    //Loops until random is greater than or equal to 16.
    while (random < 16) {
        random = number.nextInt(15) + 5;
        //For loop prints out 'x' equal to the random value.
        for (int xCount = 0; xCount < random; xCount++) {
            System.out.print("x");
        }
        System.out.println();
    }
  }

  /*
  Write a method named randomWalk that performs a random one-dimensional walk, reporting
  each position reached and the maximum position reached during the walk. The random walk
  should begin at position 0. On each step, you should either increase or decrease the
  position by 1 (with equal probability). The walk stops when 3 or -3 is hit.
  The output should look like this:

    position = 0
    position = 1
    position = 0
    position = -1
    position = -2
    position = -1
    position = -2
    position = -3
    max position = 1

  */

  public static void randomWalk () {
    Random rnd = new Random();
    int num = 0;
    int maxPosition = 0;
    //The position starts at 0.
    System.out.println("position = " + num);
    //Once there is an absolute difference of 3 between the current and starting position, the program stops.
    while (num != 3 && num != -3) {
        //50-50 chance to move forward or backward.
        if (rnd.nextInt(2) == 1) {
            num -= 1;
        } else {
            num += 1;
        }
        //The program keeps track of the largest number position.
        maxPosition = Math.max(maxPosition, num);
        System.out.println("position = " + num);
    }
    System.out.println("max position = " + maxPosition);
  }

}
