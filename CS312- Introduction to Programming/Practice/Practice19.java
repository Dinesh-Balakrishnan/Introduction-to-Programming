public class Practice19 {

  public static void main(String[] args) {
    int[] lastIndexOfTest = {74, 85, 102, 99, 101, 85, 56};
    int[] rangeTest = {8, 3, 5, 7, 2, 4};
    int[] isSortedTest = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
    int[] modeTest = {27, 15, 15, 11, 27};
    int[] stdevTest = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
    int[] minGapTest = {1, 3, 6, 7, 12};
    System.out.println(lastIndexOf(lastIndexOfTest, 85));
    System.out.println(range(rangeTest));
    System.out.println(isSorted(isSortedTest));
    System.out.println(mode(modeTest));
    System.out.println(stdev(stdevTest));
    System.out.println(minGap(minGapTest));
  }

  /*Write a method named lastIndexOf that accepts an array of integers and an integer
  value as its parameters and returns the last index at which the value occurs in the
  array. The method should return -1 if the value is not found. For example, in the
  list containing {74, 85, 102, 99, 101, 85, 56}, the last index of the value 85 is 5.*/

  public static int lastIndexOf(int[] nums, int target) {
    int length = nums.length - 1;
    //In order to find the last index, it is best to loop from the last index to the 0th.
    for (int index = length; index >= 0; index--) {
        if(nums[index] == target) {
            return index;
        }
    }
    //If the integer ins't found within the array, -1 is returned.
    return -1;
  }

  /*Write a static method named range that takes an array of integers as a parameter
  and returns the range of values contained in the array. The range of an array is defined
  to be one more than the difference between its largest and smallest element. For example,
  if the largest element in the array is 15 and the smallest is 4, the range is 12. If
  the largest and smallest values are the same, the range is 1. You may assume the array
  contains at least one element.*/

  public static int range(int[] nums) {
    int length = nums.length;
    int smallestNum = nums[0];
    int largestNum = nums[0];
    for (int index = 1; index < length; index++) {
        //Math.min() and Math.max() change the max value accordingly for each value in the array.
        smallestNum = Math.min(nums[index], smallestNum);
        largestNum = Math.max(nums[index], largestNum);
    }
    //While not typically seen, +1 is added to the difference of the smallest and largest integers.
    return largestNum - smallestNum + 1;
  }

  /*Write a static method named isSorted that accepts an array of doubles as a parameter
  and returns true if the list is in sorted (nondecreasing) order and false otherwise.
  For example, if arrays named list1 and list2 store {16.1, 12.3, 22.2, 14.4} and
  {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, the calls isSorted(list1) and
  isSorted(list2) should return false and true respectively. Assume the array has at
  least one element. A one-element array is considered to be sorted.*/

  public static Boolean isSorted(double[] nums) {
    int length = nums.length;
    for (int index = 1; index < length; index++) {
        //If the current number isn't greater than or equal to the previous number, the list isn't sorted.
        if (!(nums[index] >= nums[index - 1])) {
            return false;
        }
    }
    //If the all numbers in the array are greater than or equal to the previous element, the list is sorted.
    return true;
  }

  /*Write a method called mode that returns the most frequently occurring element of
  an array of integers. Assume that the array has at least one element and that every
  element in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower value.
  For example, if the array passed contains the values {27, 15, 15, 11, 27}, your method should return 15.*/

  public static int mode(int[] nums) {
    //Initializing default values:
    int mode = nums[0];
    int times = 0;
    int arrayLength = nums.length;
    //The loop goes through every number in the list for which a total presence count needs to be found.
    for (int index = 0; index < arrayLength; index++) {
        int number = nums[index];
        int numOccurs = 0;
        //The current number is then checked with all other numbers to get a presence count.
        for(int check = 0; check < arrayLength; check++) {
            if (nums[check] == number) {
                numOccurs++;
            }
        }
        /*If the mode is greater, or the mode is tied and the number is smaller, the current value
          becomes the next node. */
        if (numOccurs > times || (numOccurs == times && number <= mode)) {
            mode = number;
            times = numOccurs;
        }
    }
    return mode;
  }

  /*Write a method called stdev that returns the standard deviation of an array of integers.
  For example, if the array passed contains the values {1, -2, 4, -4, 9, -6, 16, -8, 25, -10},
  your method should return approximately 11.237. You may assume that the array passed is
  non-null and contains at least two values, because the standard deviation is undefined otherwise. */

  public static double stdev(int[] nums) {
    int arrayLength = nums.length;
    //The average is calculated.
    double average = average(nums, arrayLength);
    //The sum of (values - average)^2 for all values is calculated.
    int squareSum = 0;
    for (int index = 0; index < arrayLength; index++) {
        squareSum += Math.pow(nums[index] - average, 2);
    }
    //The sum is then divided by the length - 1 and square rooted for the standard deviation.
    return Math.sqrt(squareSum / (arrayLength - 1));
  }

  //Calculates the average of all list elements.
  public static double average(int[] nums, int arrayLength) {
    int sum = 0;
    for (int index = 0; index < arrayLength; index++) {
        sum += nums[index];
    }
    return (double) sum / arrayLength;
  }

  /*Write a method named minGap that accepts an integer array as a parameter and returns
  the minimum 'gap' between adjacent values in the array. The gap between two adjacent
  values in a array is defined as the second value minus the first value. For example,
  suppose a variable called array is an array of integers that stores the following
  sequence of values:

                          int[] array = {1, 3, 6, 7, 12};

  The first gap is 2 (3 - 1), the second gap is 3 (6 - 3), the third gap is 1 (7 - 6)
  and the fourth gap is 5 (12 - 7). Thus, the call of minGap(array) should return 1.
  If an array with lesser than 2 elements is passed, 0 should be returned. */

  public static int minGap(int[] nums) {
    int arrayLength = nums.length;
    //Checks for a special condition where the arrayLenght is less than 2.
    if (arrayLength < 2) {
        return 0;
    }
    int lowestDifference = nums[1] - nums[0];
    //the for loop iterates over each gap.
    for (int index = 2; index < arrayLength; index++) {
        //Math.min helps keep track of the smallest gap that is calculated.
        lowestDifference = Math.min(nums[index] - nums[index - 1], lowestDifference);
    }
    return lowestDifference;
  }
}
