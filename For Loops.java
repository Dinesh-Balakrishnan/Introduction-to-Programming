/*                              PROBLEM:
Write a for loop that produces the following output without the * operator:

1 4 9 16 25 36 49 64 81 100

*/

for (int i = 0, j = 0; i < 10; i++){
    /* While the most obvious pattern seen between the numbers is that they
    are the squares of numbers starting from 1 to 10, another pattern exists.
    Each next number increases by an odd number value down the list in order.
    First value increases by 1, the next by 3, then 5, and so on. This is
    represented by the equation below. */
    j += 1 + i + i;
    System.out.print(j + " ");
}

/*                              PROBLEM:
Write for loops that produces the following output:

*
**
***
****
*****

*/

for (int i = 1; i <= 5; i++){
    //By using nested for loops, the number of * increases as the row increases.
    for (int j = i; j > 0; j--){
        System.out.print("*");
    }
    System.out.println();
}

/*                              PROBLEM:
Write for loops that produces the following output:

1
22
333
4444
55555
666666
7777777

*/

for (int i = 1; i <= 7; i++){
    for (int j = i; j > 0; j--){
        // Same as last problem, but prints the i value that equals the row number.
        System.out.print(i);
    }
    System.out.println();
}

/*                              PROBLEM:
Write for loops that produces the following output:

    1
   22
  333
 4444
55555

*/

for (int i = 1; i <= 5; i++){
    // Creates the spaces required for the number tower.
    for (int k = 5 - i; k > 0; k--){
        System.out.print(" ");
    }
    // After the spaces, the numbers are printed.
    for (int j = i; j > 0; j--){
        System.out.print(i);
    }
    System.out.println();
}

/*                              PROBLEM:
Write a method called printDesign using for loops that produces
the following output (no parameters allowed):

-----1-----
----333----
---55555---
--7777777--
-999999999-

*/

public static void printDesign() {
    // Because parameters weren't allowed, the - for loop has to be repeated twice.
    for (int i = 1; i <=9; i +=2){
        for (int j = 0; j < 5 - (i / 2); j++){
            System.out.print("-");
        }
        for (int j = 0; j < i; j++){
            System.out.print(i);
        }
        for (int j = 0; j < 5 - (i / 2); j++){
            System.out.print("-");
        }
        System.out.println();
    }
}
