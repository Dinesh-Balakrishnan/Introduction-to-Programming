/*                             PROBLEM:
Write a method called printTriangleType that accepts three integer arguments
representing the lengths of the sides of a triangle and then prints out whether
the triangle is scalene, obtuse, or equilaterial.
*/

public static void printTriangleType(int s1, int s2, int s3){
    //If all sides equal each other, the triangle is equilateral.
    if (s1 == s2 && s2 == s3){
        System.out.print("equilateral");
    //If none of the sides equal each other, the triangle is scalene.
    } else if (s1 != s2 && s2 != s3 && s1 != s3) {
        System.out.print("scalene");
    //If a triangle isn't equilateral or scalene, then it has to be isosceles.
    } else {
        System.out.print("isosceles");
    }
}

/*                             PROBLEM:
Write a static method called quadrant that takes in a pair of real numbers
representing an (x, y) coordinate.  Using the coordinate, return the number
of the quadrant it is located in.
*/

public static int quadrant (double x, double y){
    //If x and y is positive, the top-right (1) quadrant is the location.
    if (x > 0 && y > 0) {
        return 1;
    //If x is negative while y is positive, the top-left (2) quadrant is the location.
    } else if (x < 0 && y > 0) {
        return 2;
    //If x and y are negative, the bottom-left (3) quadrant is the location.
    } else if (x < 0 && y < 0 ) {
        return 3;
    //If x is positive while y is negative, the bottom-right (4) quadrant is the location.
    } else if (x > 0 && y < 0 ) {
        return 4;
    }
    /*If none of the statements work, that means that either x or y equals 0.
    This means that the coordinates aren't on any specific quadrant and 0
    is returned. */
    return 0;
}

/*                             PROBLEM:
Write a method called printSquare that takes in two integer parameters, a min and
a max. Then, print the numbers in a square pattern. Each line prints a different
permutation of the sequence, the lines increasing by +1 each line and repeating
the sequence if the max number is reached. Examples are shown below:

printSquare(1, 5);
12345
23451
34512
45123
51234

printSquare(3, 9);
3456789
4567893
5678934
6789345
7893456
8934567
9345678
*/

public static void printSquare (int min, int max) {
    //difference determines the number of rows and characters needed to be printed.
    int difference = max - min;
    //loops for each row.
    for (int rows = 0; rows <= difference; rows++){
        //Loops to print each number.
        for (int num = min; num <= max; num++){
            //output increases by 1 for each row, then also increases per number printed.
            int output = num + rows;
            /*If max is reached in a line, subtracting by the difference variable
            plus 1 resets the number line to be printed. */
            if (output > max){
                output -= difference + 1;
            }
            System.out.print(output);
        }
        System.out.println();
    }
}
