/*                              PROBLEM:
Uses escape sequences to create an ASCII representation of an egg.
*/

public class Egg{
    public static void main(String[] args){
        //Simple practice to understand that backslashes need an escape sequence.
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("-\"-'-\"-'-\"-");
        System.out.println("\\         /");
        System.out.println(" \\_______/");

    }
}

/*
The following output, a Family Guy reference, is to be created while
also reducing redundancy:

//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\

*/

public class Stewie{
    public static void main(String[] args){
        System.out.println("//////////////////////");
        /* Further repetition would've required stacked methods in order to
        reduce redundancy created by exessive amount of calling of the
        repeatStatements method. */
        repeatStatements();
        repeatStatements();
        repeatStatements();
        repeatStatements();
        repeatStatements();

    }

    /* The repeatStatements method is created so that the the two repeating
    lines wouldn't be coded more than once.*/
    public static void repeatStatements(){
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}

/*
The following output is to be created while also reducing redundancy:

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *

 */

 public class StarFigures{
    /* Uses the methods for the various asterik shapes to create the desired
    output, as shown above. Blank println statements are used for spaces. */
    public static void main(String[] args){
        starX();
        System.out.println();
        starX();
        starBulk();
        System.out.println();
        starColumn();
        starX();
    }

    // The starBulk method prints out the 5x2 set of asteriks.
    public static void starBulk(){
        System.out.println("*****");
        System.out.println("*****");
    }

    /* The starX method prints out the set of asteriks that are placed to form
    the shape of the letter "X". */
    public static void starX(){
        /* Because a bulk appears before every "X" shape,
        the starBulk method has been called. */
        starBulk();
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    // The starColum method prints out the 1x3 set of asteriks.
    public static void starColumn(){
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
