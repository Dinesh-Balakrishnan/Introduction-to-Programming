public class Practice18 {

  public static void main(String[] args) {
      wordWrap(new Scanner("hello"));
      doubleSpace(new Scanner("hello"), new PrintStream("text.txt"));
      stripHtmlTags(new Scanner(
      "<html>\n<head>\n<title>My web page</title>\n</head>\n<body>\n<p>There are many " +
      "pictures of my cat here,\nas well as my <b>very cool</b>\n</body>\n</html>"));
      printDuplicates(new Scanner("  hello how how are you you you you"));
  }

  /*
  Write a method called wordWrap that accepts a Scanner representing an input file as its
  parameter and outputs each line of the file to the console, word-wrapping all lines that
  are longer than 60 characters. For example, if a line contains 112 characters, the method
  should replace it with two lines: one containing the first 60 characters and another containing
  the final 52 characters. A line containing 217 characters should be wrapped into four lines:
  three of length 60 and a final line of length 37.
  */

  public static void wordWrap (Scanner file) {
    final int LINE_LENGTH = 60;
    while (file.hasNextLine()) {
        String line = file.nextLine();
        //Determines how many individual lines the string should be broken into.
        int fullLines = (line.length() - 1) / LINE_LENGTH;
        //Loops for each line.
        for (int lineprint = 1;lineprint <= fullLines; lineprint++)
            //The starting index and ending index increment by the line length for each loop.
            System.out.println(line.substring((lineprint - 1) * LINE_LENGTH, lineprint * LINE_LENGTH));
        System.out.println(line.substring(fullLines * 60));
    }
  }

  /*
  Write a method named doubleSpace that accepts a Scanner for an input file and a PrintStream for
  an output file as its parameters, writing into the output file a double-spaced version of the
  text in the input file.
  */

  public static void doubleSpace (Scanner in, PrintStream out) {
    while (in.hasNextLine()) {
        out.println(in.nextLine());
        //Just need that extra space.
        out.println();
    }
  }

  /*
  Write a method called stripHtmlTags that accepts a Scanner representing an input file containing an HTML web page as its parameter, then reads that file and prints the file's text with all HTML tags removed. A tag is any text between the characters < and > . For example, consider the following text:

  <html>
    <head>
      <title>My web page</title>
    </head>
    <body>
      <p>There are many pictures of my cat here,
        as well as my <b>very cool</b> blog page,
        which contains <font color="red">awesome
        stuff about my trip to Vegas.</p>

      Here's my cat now:<img src="cat.jpg">
    </body>
    </html>

  If the file contained these lines, your program should output the following text:


  My web page


  There are many pictures of my cat here,
  as well as my very cool blog page,
  which contains awesome
  stuff about my trip to Vegas.

  Here's my cat now:

  You may assume that the file is a well-formed HTML document and that there are no
  < or > characters inside tags.
  */

  public static void stripHtmlTags (Scanner HTML) {
    while (HTML.hasNextLine()) {
        Scanner line = new Scanner(HTML.nextLine());
        //The > tag is used as a delimiter because each token will contain the tag at the end.
        line.useDelimiter(">");
        while (line.hasNext()) {
            String word = line.next();
            //Gets the position of the start of the tag.
            int place = word.indexOf("<");
            //Makes sure information isn't lost if a tag isn't present
            if (place == -1) {
                System.out.print(word);
            } else {
                //Prints out information from the beginning till the start of the tag.
                System.out.print(word.substring(0, place));
            }
        }
        System.out.println();
    }
  }

  /*
  Write a method named printDuplicates that accepts as its parameter a Scanner for an input
  file containing a series of lines. Your method should examine each line looking for
  consecutive occurrences of the same token on the same line and print each duplicated token
  along how many times it appears consecutively. Non-repeated tokens are not printed. Repetition
  across multiple lines (such as if a line ends with a given token and the next line starts
  with the same token) is not considered in this problem.

  For example, if the input file contains the following text:

  hello how how are you you you you
  I I I am Jack's Jack's smirking smirking smirking smirking smirking revenge
    bow  wow wow yippee yippee   yo yippee   yippee yay  yay yay
  one fish two fish red fish blue fish
  It's the Muppet Show, wakka wakka wakka

  Your method would produce the following output for the preceding input file:

  how*2 you*4
  I*3 Jack's*2 smirking*5
  wow*2 yippee*2 yippee*2 yay*3

  wakka*3

  Your code prints only the repeated tokens; the ones that only appear once in a row
  are not shown. Your code should place a single space between each reported duplicate
  token and should respect the line breaks in the original file. This is why a blank line
  appears in the expected output, corresponding to the fourth line of the file that did not
  contain any consecutively duplicated tokens. You may assume that each line of the file
  contains at least 1 token of input.
  */

  public static void printDuplicates (Scanner file) {
    while (file.hasNextLine()) {
        Scanner line = new Scanner(file.nextLine());
        //Variables keep track of the word count and the last token in a line.
        int counter = 1;
        String prevInput = "";
        while (line.hasNext()) {
            //Takes the next input and determines whether it is equal to the last input.
            String input = line.next();
            Boolean isEqual = input.equals(prevInput);
            if (isEqual) {
                counter++;
            }
            /*Checks to see whether the previous token and the current token are equal,
            and that there are more tokens to the current line. If these cases do not
            match and the counter is greater than one, then the statement and the number
            of times it has occured are to be printed. */
            if (counter != 1 && !(isEqual && line.hasNext())) {
                System.out.print(prevInput + "*" + counter + " ");
                counter = 1;
                prevInput = "";
            }
            prevInput = input;
        }
        System.out.println();
    }
  }
}
