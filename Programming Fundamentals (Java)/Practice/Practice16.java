public class Practice16 {

  public static void main(String[] args) {
    System.out.println(gcd(100, 75));
    System.out.println(consecutive(8, 7, 9));
    System.out.println(monthApart(10, 4, 11, 4));
  }

  /* Write a method called gdc that takes in int A and int B as parameters, then
  calculates the greatest common divisor of the two. */

  public static int gcd (int A, int B) {
    A = Math.abs(A);
    B = Math.abs(B);
    while (B != 0) {
        //Repeatedly modding A by B and swapping the two values will result in B == 0 and A == GCD.
        A %= B;
        int C = B;
        B = A;
        A = C;
    }
    return Math.max(A, B);
  }

  /*
  Write a method called consecutive that takes in three integers in any order and determines
  whether they are consecutive or not.
  */

  public static Boolean consecutive (int k, int k1, int k2) {
    //Identifying each value as the smallest, largest, or median.
    int smallest = Math.min(Math.min(k, k1), k2);
    int largest = Math.max(Math.max(k, k1), k2);
    int mid = k + k1 + k2 - smallest - largest;
    //Returning the boolean expression that checks for consecutiveness.
    return smallest + 1 == mid && mid + 1 == largest;
  }

  /*
  Write a method called monthApart that takes in the ints month1, day1, month2, and
  day2. Using these two values, the method should return whether the two specified
  dates (month1 and day1) and (month2 and day2), are a month apart.
  */

  public static Boolean monthApart (int month1, int day1, int month2, int day2) {
    int monthDifference = month1 - month2;
    //Checks to see whether the month difference is greater than one.
    boolean moreThanOneMonth = Math.abs(monthDifference) > 1;
    //Returns whether true for a large month difference, or sufficient day difference.
    return moreThanOneMonth || monthDifference == 1 && day1 >= day2 || monthDifference == -1 && day2 >= day1;
  }
}
