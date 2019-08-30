public class Practice17 {

  public static void main(String[] args) {
      boygirl(new Scanner("Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6"));
      System.out.println(negativeSum(new Scanner("38 4 19 -27 -15 -3 4 19 38")));
      evenNumbers(new Scanner("5 7 2 8 9 10 12 98 7 14 20 22"));
      System.out.println(readEntireFile(new Scanner("A\nB\nC\nD")));
  }
  /*
  Write a method named boyGirl that accepts a Scanner as a parameter. The Scanner is reading
  its input from a file containing a series of names followed by integers. The names alternate
  between boys' names and girls' names. Your method should compute the absolute difference
  between the sum of the boys' integers and the sum of the girls' integers. The input could end
  with either a boy or girl; you may not assume that it contains an even number of names. If the
  input file contains the following text:

  Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6

  then your method should produce the following output:

  4 boys, 3 girls
  Difference between boys' and girls' sums: 2
  */

  public static void boyGirl(Scanner input) {
    //Need to keep track of the sum of each gender's age and their count.
    int boyCount = 0;
    int girlCount = 0;
    int boyAge = 0;
    int girlAge = 0;
    //Alternating boolean helps switch between checking for a boy or girl.
    Boolean wasGirl = true;
    while (input.hasNext()) {
        input.next();
        int number = input.nextInt();
        //If the last input was for a girl, this one is for a boy.
        if (wasGirl) {
            boyCount++;
            boyAge += number;
        //If the last input was for a boy, this one is for a girl.
        } else {
            girlCount++;
            girlAge += number;
        }
        //Alternates the boolean variable.
        wasGirl = !wasGirl;
    }
    int ageDifference = Math.abs(boyAge - girlAge);
    System.out.println(boyCount + " boys, " + girlCount + " girls");
    System.out.println("Difference between boys' and girls' sums: " + ageDifference);
  }

  /*
  Write a method named negativeSum that accepts a Scanner as a parameter reading input from
  a file containing a series of integers, and determine whether the sum starting from the
  first number is ever negative. The method should print a message indicating whether a negative
  sum is possible and should return true if a negative sum can be reached and false if not.
  For example, if the file contains the following text:

  38 4 19 -27 -15 -3 4 19 38

  your method will consider the sum of just one number (38), the sum of the first two numbers
  (38 + 4), the sum of the first three numbers (38 + 4 + 19), and so on up to the sum of all
  of the numbers. Because the above file doesn't contain any negative sum, the method would
  return false and print the following message:

  no negative sum.

  If the file instead contains the following numbers:

  14 7 -10 9 -18 -10 17 42 98

  It should return true and print the following message:

  -8 after 6 steps

  */

  public static Boolean negativeSum (Scanner nums) {
    //Keeps track tokens read and the sum of these tokens.
    int numSum = 0;
    int steps = 0;
    while(nums.hasNext()) {
        //Changes the two variables for each token.
        int currentNum = nums.nextInt();
        numSum += currentNum;
        steps++;
        //Once the sum of the tokens is below 0, the program stops.
        if (numSum < 0) {
            System.out.printf("%d after %d steps", numSum, steps);
            return true;
        }
    }
    //If all the tokens have run out, the sum is positive.
    System.out.println("no negative sum");
    return false;
  }

  /*
  Write a method named evenNumbers that accepts a Scanner as a parameter reading input
  from a file containing a series of integers, and report various statistics about the
  integers. You may assume that there is at least one integer in the file. Report the
  total number of numbers, the sum of the numbers, the count of even numbers and the
  percent of even numbers. For example, if a Scannerinput on file numbers.txt
  contains the following text:

  5 7 2 8 9 10 12 98 7 14 20 22

  then the call evenNumbers method should produce the following output:

  12 numbers, sum = 214
  8 evens (66.67%)

  */

  public static void evenNumbers(Scanner nums) {
    //Keeps track of the necessary information.
    int totalNums = 0;
    int numSum = 0;
    int evens = 0;
    //Reads through the entire file.
    while (nums.hasNext()) {
        int currentNum = nums.nextInt();
        totalNums++;
        numSum += currentNum;
        //Determines whether the current int token is even or not.
        if (currentNum % 2 == 0) {
            evens += 1;
        }
    }
    //Calculates the percent of even integers.
    double evenPercent = (double) evens / totalNums * 100;
    //All this information is printed out.
    System.out.println(totalNums + " numbers, sum = " + numSum);
    System.out.printf("%d evens (%.2f%s)", evens, evenPercent, "%");
  }

  /*
  Write a method named readEntireFile that accepts a Scanner representing an input file as
  its parameter, then reads that file and returns the entire text contents of that file as a String.
  */

  public static String readEntireFile (Scanner file) {
    String output = "";
    while (file.hasNextLine()) {
        //Need to adjust for the consumption of the \n character when getting the line.
        output += file.nextLine() + "\n";
    }
    return output;
  }
}
