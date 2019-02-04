public class Practice21 {

  public static void main(String[] args) {
    int[] medianTest = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
    int[] kthLargestTest = {74, 85, 102, 99, 101, 56, 84};
    System.out.println(median(medianTest));
    System.out.println(kthLargest(kthLargestTest, 2));
  }

  /*Implementing the selection sort algorithm.*/
  public static void selectionSort(int[] nums, int numCount) {
    for (int index = 0; index < numCount; index++) {
        int smallestNum = nums[index];
        int position = 0;
        for (int check = index + 1; check < numCount; check++) {
            if (nums[check] < smallestNum) {
                smallestNum = nums[check];
                position = check;
            }
        }
        int temp = nums[index];
        nums[index] = smallestNum;
        nums[position] = temp;
    }
  }

  /*Write a method called median that accepts an array of integers as its argument
  and returns the median of the numbers in the array. The median is the number that
  will appear in the middle if you arrange the elements in order. Assume that the array
  is of odd size (so that one sole element constitutes the median) and that the numbers
  in the array are between 0 and 99 inclusive. For example, the median of
  {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5, and the median of
  {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25. */

  public static int median(int[] nums) {
    int numCount = nums.length;
    selectionSort(nums, numCount);
    return nums[numCount / 2];
  }

  /*Write a method called kthLargest that accepts an integer k and an array a as its
  parameters and returns the element such that k elements have greater or equal value.
  If k = 0, return the largest element; if k = 1, return the second largest element, and so on.
  For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84}
  and the integer k passed is 2, your method should return 99 because there are two
  values at least as large as 99 (101 and 102). Assume that 0 <= k < a.length. */

  public static int kthLargest(int position, int[] nums) {
    int numCount = nums.length;
    selectionSort(nums, numCount);
    return nums[numCount - (position + 1)];
  }
}
