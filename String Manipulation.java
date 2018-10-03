/*                              PROBLEM:
Write a method called padString that accepts a String and an integer
representing length. The method should return the string with spaces until
it is the given length. If the string length is already long enough, just
return the string. An example is shown below:

padString("hello", 8);
"   hello"

*/

public static String padString(String phrase, int length) {
    //extraSize determines how many spaces are requried.
    int extraSize = length - phrase.length();
    //If extraSize is less than or equal to 0, there is no change required.
    if (extraSize <= 0) {
        return phrase;
    } else {
        //Creates the final string that needs to be outputted
        String finalString = "";
        //for loop adds the spaces needed
        for (; extraSize > 0; extraSize--) {
            finalString += " ";
        }
        //returns the spaces and the final phrase to meet the required length.
        return finalString + phrase;
    }
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
Write a method called vertical that accepts a String as its parameter
and prints each letter of the string on a separate line. An example is shown
below:

vertical("hey now");
h
e
y

n
o
w

*/

public static void vertical (String phrase) {
    //Repeats for the total number of characters.
    for (int ch = 0; ch < phrase.length(); ch++){
        //Uses the substring method to get each character of the phrase.
        System.out.println(phrase.substring(ch, ch + 1));
    }
}
