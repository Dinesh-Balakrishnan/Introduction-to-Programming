/*
Use only for loops to produce the following output:

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------

*/

for (int i = 0; i < 40; i++){
    System.out.print("-");
} System.out.println();

for (int i = 0; i < 10; i++){
    System.out.print("_-^-");
} System.out.println();

for (int i = 1; i < 21; i++){
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
    public static final int SIZE = 4;
    public static void main(String[] args){
        for (int i = 0; i < SIZE; i++){
            int neededExclamation = (SIZE - i) * 4 - 2;
            for (int j = 0; j < i; j++){
                System.out.print("\\\\");
            } 
            for (int j = 0; j < neededExclamation; j++){
                System.out.print("!");
            }
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

for (int i = 0; i < 6; i++){
    for (int j = 0; j < 9; j++){
        System.out.print(" ");
    }
    System.out.print("|");
}
System.out.println();
for (int i = 1; i <= 60; i++){
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
