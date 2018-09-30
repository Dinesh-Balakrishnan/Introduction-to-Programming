/*
Write a for loop that produces the following output without the * operator:

1 4 9 16 25 36 49 64 81 100

*/

for (int i = 0, j = 0; i < 10; i++){
    j += 1 + i + i;
    System.out.print(j + " ");
}

/*
Write for loops that produces the following output:

*
**
***
****
*****

*/

for (int i = 1; i <= 5; i++){
    for (int j = i; j > 0; j--){
        System.out.print("*");
    }
    System.out.println();
}

/*
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
        System.out.print(i);
    }
    System.out.println();
}

/*
Write for loops that produces the following output:

    1
   22
  333
 4444
55555

*/

for (int i = 1; i <= 5; i++){
    for (int k = 5 - i; k > 0; k--){
        System.out.print(" ");
    }
    for (int j = i; j > 0; j--){
        System.out.print(i);
    }
    System.out.println();
}

/*
Write a method called printDesign using for loops that produces
the following output:

-----1-----
----333----
---55555---
--7777777--
-999999999-

*/

public static void printDesign() {
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
