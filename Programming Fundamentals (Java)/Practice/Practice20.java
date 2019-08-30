import java.util.Arrays;

public class Practice20 {

  public static void main(String[] args) {
    int[] percentEvenTest = {6, 2, 9, 11, 3};
    int[] isUniqueTest = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
    int[] longestSortedSequenceTest = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};
    int[] containsTest = {1, 6, 2, 1, 4, 1, 2, 1, 8}, {1, 2, 1};
    int[] collapseTest = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
    System.out.println(percentEven(percentEvenTest));
    System.out.println(isUnique(isUniqueTest));
    System.out.println(longestSortedSequence(longestSortedSequenceTest));
    System.out.println(contains(containsTest));
    int[] collapsed = collapse(collapseTest);
    System.out.println(collapsed);
    wordLengths(new Scanner("hello how are you feeling today"));
  }

  /*Write a method called percentEven that accepts an array of integers as a parameter
  and returns the percentage of even numbers in the array as a real number. For example,
  if the array stores the elements {6, 2, 9, 11, 3}, then your method should return 40.0.
  If the array contains no even elements or no elements at all, return 0.0. */

  public static double percentEven(int[] nums) {
    int evens = 0;
    int length = nums.length;
    if (length == 0) {
        return 0.0;
    }
    for (int index = 0; index < length; index++) {
        if (nums[index] % 2 == 0) {
            evens++;
        }
    }
    return (double) evens / length * 100;
  }

  /*Write a method named isUnique that takes an array of integers as a parameter and
  that returns a boolean value indicating whether or not the values in the array are
  unique (true for yes, false for no). The values in the list are considered unique
  if there is no pair of values that are equal. For example, if a variable called
  list stores the following values:

  int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};

  Then the call of isUnique(list) should return true because there are no duplicated
  values in this list. */

  public static Boolean isUnique(int[] nums) {
    int length = nums.length;
    for (int index = 0; index < length; index++) {
        for (int check = 0; check < length; check++) {
            if (index != check && nums[index] == nums[check]) {
                return false;
            }
        }
    }
    return true;
  }

  /*Write a method named longestSortedSequence that accepts an array of integers as
  a parameter and that returns the length of the longest sorted (nondecreasing) sequence
  of integers in the array. For example, if a variable named array stores the following values:

  int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};

  then the call of longestSortedSequence(array) should return 4 because the longest
  sorted sequence in the array has four values in it (the sequence -3, 0, 14, 207).
  Notice that sorted means nondecreasing, which means that the sequence could contain
  duplicates. For example, if the array stores the following values:

  int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19}

  Then the method would return 5 for the length of the longest sequence (the sequence 3, 5, 5, 5, 8).
  Your method should return 0 if passed an empty array. */

  public static int longestSortedSequence(int[] nums) {
    int indexLength = nums.length - 1;
    if (indexLength < 0) {
        return 0;
    }
    int maxLength = 1;
    for (int index = 1, sortedLength = 1; index <= indexLength; index++) {
        Boolean greater = nums[index] >= nums[index - 1];
        if (greater) {
            sortedLength++;
        } 
        if (!greater || index == indexLength){
            maxLength = Math.max(maxLength, sortedLength);
            sortedLength = 1;
        }
    }
    return maxLength;
  }

  /*Write a static method named contains that accepts two arrays of integers a1 and
  a2 as parameters and that returns a boolean value indicating whether or not a2's
  sequence of elements appears in a1 (true for yes, false for no). The sequence of
  elements in a2 may appear anywhere in a1 but must appear consecutively and in the
  same order. For example, if variables called list1 and list2 store the following values:

  int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
  int[] list2 = {1, 2, 1};

  Then the call of contains(list1, list2) should return true because list2's sequence of
  values {1, 2, 1} is contained in list1 starting at index 5. If list2 had stored the
  values {2, 1, 2}, the call of contains(list1, list2) would return false because list1
  does not contain that sequence of values. Any two lists with identical elements are
  considered to contain each other, so a call such as contains(list1, list1) should return true.

  You may assume that both arrays passed to your method will have lengths of at least 1.
  You may not use any Strings to help you solve this problem, nor methods that produce
  Strings such as Arrays.toString. */

  public static boolean contains(int[] nums, int[] sequence) {
    int numsLength = nums.length;
    int sequenceLength = sequence.length;
    for (int index = 0, position = 0; index < numsLength; index++) {
        int currentNum = nums[index];
        if (currentNum == sequence[position]) {
            position++;
        } else if (currentNum == sequence[0]) {
            position = 1;
        } else {
            position = 0;
        }
        if (position == sequenceLength) {
                return true;
        }
    }
    return false;
  }

  /*Write a method called collapse that accepts an array of integers as a parameter
  and returns a new array containing the result of replacing each pair of integers with
  the sum of that pair. For example, if an array called list stores the values
  {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, then the call of collapse(list) should return a new
  array containing {9, 17, 17, 8, 19}. The first pair from the original list is collapsed
  into 9 (7 + 2), the second pair is collapsed into 17 (8 + 9), and so on. If the list
  stores an odd number of elements, the final element is not collapsed. For example,
  if the list had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}. Your
  method should not change the array that is passed as a parameter. */

  public static int[] collapse(int[] nums) {
    int numsLength = nums.length;
    int collapseTimes = numsLength / 2;
    int[] collapsed = new int[collapseTimes];
    if (numsLength % 2 == 1) {
        collapsed = new int[collapseTimes + 1];
        collapsed[collapseTimes] = nums[numsLength - 1];
    }
    for (int pair = 0; pair < collapseTimes; pair++) {
        collapsed[pair] = nums[pair * 2] + nums[pair * 2 + 1];
    }
    return collapsed;
  }

  /*Write a method called wordLengths that accepts a Scanner representing an input
  file as its argument. Your method should read from the given file, count the number
  of letters in each token in the file, and output a result diagram of how many words
  contain each number of letters. Use tabs before the asterisks so that they'll line up.
  If there are no words of a given length, omit that line from the output.

  For example, if the file contains the following text:
  ------
  Before sorting:
  13 23 480 -18 75
  hello how are you feeling today

  After sorting:
  -18 13 23 75 480
  are feeling hello how today you
  ------
  your method should produce the following output to the console:
  ------
  2: 6    ******
  3: 10   **********
  5: 5    *****
  6: 1    *
  7: 2    **
  8: 2    **
  ------
  */

  public static void wordLengths(Scanner file) {
    final int MAX_CHARS = 80;
    int[] wordLengths = new int[MAX_CHARS];
    while(file.hasNext()) {
        String token = file.next();
        wordLengths[token.length() - 1] += 1;
    }
    for (int index = 0; index < MAX_CHARS; index++) {
        int count = wordLengths[index];
        if (count > 0) {
            System.out.printf("%d: %d\t%*s", (index + 1), count, "*", count);
            System.out.println();
        }
    }
  }
}
