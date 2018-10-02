/*
Use only for loops to produce the following output:

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------

*/

//No methods are allowed, so the first and last for loops are the same.
//1st for loop - Prints out the first line of dashes.
for (int i = 0; i < 40; i++){
    System.out.print("-");
} System.out.println();

//2nd for loop - prints out the repeating ASCII mountain structure.
for (int i = 0; i < 10; i++){
    System.out.print("_-^-");
} System.out.println();

//3rd for loop - prints out a sequence of numbers.
for (int i = 1; i < 21; i++){
    // Because the same number appears twice, the print stateent is duplicated.
    System.out.print(i%10);
    System.out.print(i%10);
} System.out.println();

for (int i = 0; i < 40; i++){
    System.out.print("-");
}

/*
Create a class called SlashFigure that uses one public static final constant
to create an ASCII art that depends on the value of the constant. A couple of
size examples are shown:

Size 4 -
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

Size 7 -
!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!////////
\\\\\\\\\\!!!!!!//////////
\\\\\\\\\\\\!!////////////

*/

public class SlashFigure {
    //SIZE variable determines how big the strucure should be.
    public static final int SIZE = 4;
    public static void main(String[] args){
        /* Parent for loop repeats for the number of lines on the ASCII art,
        which is equal to the size of the art. */
        for (int i = 0; i < SIZE; i++){
            /* neededExclamation determines how many ! appear per line;
            decreases by 4 each repetition. */
            int neededExclamation = (SIZE - i) * 4 - 2;
            //Prints out the beginning backslashes per line.
            for (int j = 0; j < i; j++){
                //4 back spcaces are used instead of two because of escape sequencing.
                System.out.print("\\\\");
            } 
            // Prints out the exclamations marks after the backslashes.
            for (int j = 0; j < neededExclamation; j++){
                System.out.print("!");
            }
            // Prints out the front slashes at the end of each line.
            for (int j = 0; j < i; j++){
                System.out.print("//");
            }
            System.out.println();
        }
    }  
}

/*
Use for loops to create the following output:

         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890

*/

//Repeats 6 times, for each pipe character.
for (int i = 0; i < 6; i++){
    //Between each pipe character are nine spaces, created by the for loop below.
    for (int j = 0; j < 9; j++){
        System.out.print(" ");
    }
    //After the spaces, a pipe character is printed.
    System.out.print("|");
}
System.out.println();
/* 60 characters are present in total in the number line. This was determined
by 6 pipe characters and 6*9 spaces. 6*9 + 6 = 6*10 = 60. */
for (int i = 1; i <= 60; i++){
    //Modulo helps with repetition in sequences.
    System.out.print(i%10);
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
