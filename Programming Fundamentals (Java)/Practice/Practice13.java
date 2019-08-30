public class Practice13 {

  public static void main(String[] args) {
    printReverse("Hello there!");
    System.out.println(swapPairs("hello there"));
    System.out.println(wordCount("hello"));
  }

  /*
  Write a method called printReverse that accepts a String as its parameter and prints the
  characters in opposite order. For example, a call of printReverse("hello there!"); should
   print the following output:

   !ereht olleh

   If the empty string is passed, no output is produced. Your method should produce a complete line of output.
  */

  public static void printReverse (String input) {
    //Loops through each character of the string, in reverse.
    for (int chr = input.length() - 1; chr >= 0; chr--) {
        System.out.print(input.charAt(chr));
    }
 }

 /*
 Write a method called swapPairs that accepts a String as a parameter and returns that String
 with each pair of adjacent letters reversed. If the String has an odd number of letters, the
 last letter is unchanged. For example, the call swapPairs("example") should return "xemalpe"
 and the call swapPairs("hello there") should return "ehll ohtree".
 */

 public static String swapPairs (String input) {
    int length = input.length();
    String fin = "";
    //Loops through all even sets and adds the latter character to the fin variable first.
    for (int chr = 1; chr < length; chr += 2) {
        fin += input.charAt(chr);
        fin += input.charAt(chr - 1);
    }
    //Checks to see whether the length is odd. If it is, the last character is added to the fin variable.
    if (length % 2 == 1) {
        fin += input.charAt(length - 1);
    }
    return fin;
}

/*
Write a method called wordCount that accepts a String as its parameter and returns the number of words in
the String. A word is a sequence of one or more nonspace characters (any character other than ' ').
For example, the call wordCount("hello") should return 1, the call wordCount("how are you?") should return 3,
the call wordCount(" this     string has     wide       spaces ") should return 5, and the call wordCount(" ")
should return 0.
*/

public static int wordCount(String input) {
    int length = input.length(); 
    int wordCount = 0;
    char lastChar = ' ';
    //Loops through every character.
    for (int charCheck = 0; charCheck < length; charCheck++) {
        //Checks to see whether a whitespace exists.
        if (input.charAt(charCheck) == ' ') {
            lastChar = ' ';
            //If the last space is a whitespace and the current one isn't, the word count increases.
        } else if (lastChar == ' ') {
            lastChar = input.charAt(charCheck);
            wordCount++;
        }
    }
    return wordCount;
}
}
