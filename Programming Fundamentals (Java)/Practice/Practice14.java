public class Practice14 {

  public static void main(String[] args) {
    System.out.println(toBinary(42));
    diceSum();
    Scanner input = new Scanner(System.in);
    printAverage(input);
    codeTracing();
    logicExpressions();
  }

  /*
``Write a method named toBinary that accepts an integer as a parameter and returns
  a string of that number's representation in binary. For example, the call of
  toBinary(42) should return "101010".
  */

  public static String toBinary(int input) {
    String reverse = "";
    //Checks for an input exception of 0.
    if (input == 0) {
        reverse = "0";
    } else {
        /*To get the binary value, constantly divide by two and get the modulo of the
          initial value until it is 0.*/
        while (input > 0) {
            reverse += input % 2;
            input /= 2;
        }
    }
    return printReverse(reverse);
  }

  //Returns the string in reverse.
  public static String printReverse (String input) {
    String binary = "";
    for (int chr = input.length() - 1; chr >= 0; chr--) {
        binary += input.charAt(chr);
    }
    return binary;
  }

  /*
  Write a method named diceSum that prompts the user for a desired sum, then repeatedly
  rolls two six-sided dice until their sum is the desired sum. Here is the expected dialogue with the user:

    Desired dice sum: 9
    4 and 3 = 7
    3 and 5 = 8
    5 and 6 = 11
    5 and 6 = 11
    1 and 5 = 6
    6 and 3 = 9

  */

  public static void diceSum () {
    //A Scanner is created to get user input for their desired sum value.
    Scanner input = new Scanner(System.in);
    System.out.print("Desired dice sum: ");
    int sum = input.nextInt();
    int diceSum = 0;
    //Generates random numbers and adds them together until the sum is reached.
    while (diceSum != sum) {
        int roll1 = (int) Math.ceil(Math.random() * 6);
        int roll2 = (int) Math.ceil(Math.random() * 6);
        diceSum = roll1 + roll2;
        System.out.println(roll1 + " and " + roll2 + " = " + diceSum);
    }
  }

  /*
  Write a method named printAverage that accepts a Scanner for the console as a parameter
  and repeatedly prompts the user for numbers. Once any number less than zero is typed,
  the average of all non-negative numbers typed is displayed. Display the average as a double,
  and do not round it. The following is one example log of execution for your method:

    Type a number: 7
    Type a number: 4
    Type a number: 16
    Type a number: -4
    Average was 9.0

  If the first number typed is negative, do not print an average
  */

  public static void printAverage (Scanner input) {
    double addedNums = 0;
    int totalNums = 0;
    //Gets initial input.
    System.out.print("Type a number: ");
    double recentInput = input.nextDouble();
    //While the input isn't negative, the user input taken into average calculation.
    while (recentInput >= 0) {
        System.out.print("Type a number: ");
        addedNums += recentInput;
        totalNums++;
        recentInput = input.nextDouble();

    }
    if (totalNums != 0) {
        System.out.println("Average was " + (addedNums / totalNums));
    }
  }

  public static void codeTracing() {
    /*
    Given the following method:

      public static void mystery(int x) {
        int y = 0;
        while (x % 2 == 0) {
          y++;
          x = x / 2;
        }
    System.out.println(x + " " + y);
    }

    Write the output of each of the following calls:
      mystery(19);  :  19 0
      mystery(42);  :  21 1
      mystery(48);  :  3 4
      mystery(40);  :  5 3
      mystery(64);  :  1 6
    */
  }

  public static void logicExpressions() {
    /*
    Given the following variable declarations:

      int x = 27;
      int y = -1;
      int z = 32;
      boolean b = false;

    What is the value of each of the following boolean expressions?
      !b	                                  | true
      b || true	                            | true
      (x > y) && (y > z)	                  | false
      (x == y) || (x <= z)	                | true
      !(x % 2 == 0)	                        | true
      (x % 2 != 0) && b	                    | false
      b && !b	                              | false
      b || !b	                              | true
      (x < y) == b	                        | true
      !(x / 2 == 13) || b || (z * 3 == 96)	| true
      (z < x) == false	                    | true
      !((x > 0) && (y < 0))	                | false
    */
  }

}
