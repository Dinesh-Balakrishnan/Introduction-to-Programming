public class Practice12 {

  public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      longestName(console, 5);
      smallestLargest();
  }

  /*                             PROBLEM:
  Write a static method called longestName that reads names typed by the user
  and prints out the longest name. The method should accept a Scanner method
  and and integer representing the number of names to check from. Despite the
  given cases, the first letter of the longest name should be capitalized when
  printed. Alternatively, the others letters should be in lower case. The format
  should replicate the example shown below (Inputs are in ""):

  Scanner console = new Scanner(System.in);
  longestName(console, 5);

  name #1? "roy"
  name #2? "DANE"
  name #3? "Erik"
  name #4? "sTeFaNiE"
  name #5? "LaurA"
  Stefanie's name is longest

  Scanner console = new Scanner(System.in);
  longestName(console, 7);

  name #1? "TrEnt"
  name #2? "rita"
  name #3? "JORDAN"
  name #4? "craig"
  name #5? "leslie"
  name #6? "YUKI"
  name #7? "TaNnEr"
  Jordan's name is longest
  (There was a tie!)
  */

  public static void longestName(Scanner console, int names) {
      String longestName = "";
      String extraPhrase = "";
      //The code loops for the number of names that need to be asked.
      for (int counter = 1; counter <= names; counter++){
          //Asks the user for a name.
          System.out.print("name #" + counter + "? ");
          //Captures user input.
          String input = console.nextLine();
          //if statement determines whether a tie exists between two names.
          if (input.length() == longestName.length()) {
              extraPhrase = "\n(There was a tie!)";
          /*else-if statement replaces the longestName variable if next input
          is longer in length. */
          } else if (input.length() > longestName.length()) {
              longestName = input;
              extraPhrase = "";
          }
      }
      /*Prints out the longest name with the longest formatting, and prints out
      a tie statement if one is present. */
      System.out.println(longestName.substring(0,1).toUpperCase() + 
                         longestName.substring(1).toLowerCase() + "'s name is longest" + extraPhrase);
  }

  /*                             PROBLEM:
  Write a method named smallestLargest that asks the user to enter numbers, then
  prints the smallest and largest of all the numbers typed in by the user.
  The user will enter a valid number greater than 0 for the number of numbers
  to read. An example will be shown below (Inputs are in ""):

  How many numbers do you want to enter? "4"
  Number 1: "5"
  Number 2: "11"
  Number 3: "-2"
  Number 4: "3"
  Smallest = -2
  Largest = 11
  */

  public static void smallestLargest() {
      Scanner src = new Scanner(System.in);
      int largestNum = 0;
      int smallestNum = 0;
      System.out.print("How many numbers do you want to enter? ");
      int nums = src.nextInt();
      //Loops for the total amount of numbers to be entered, based on user input.
      for (int count = 1; count <= nums; count++) {
          //Asks the user for a name.
          System.out.print("Number " + count + ": ");
          int input = src.nextInt();
          /*Because the largestNum and smallestNum variables need to be initialized,
          an extra number 0 plays a role in determining the largest and smallest
          numbers. This is why the first number becomes the value of the two
          variables to start. */
          if (count == 1){
              largestNum = input;
              smallestNum = input;
          }
          //Math.max and Math.min find the smallest number themselves.
          largestNum = Math.max(largestNum, input);
          smallestNum = Math.min(smallestNum, input);
      }
      //Prints out the smallest and largest numbers.
      System.out.println("Smallest = " + smallestNum);
      System.out.println("Largest = " + largestNum);
  }
}
