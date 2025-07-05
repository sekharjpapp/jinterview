package com.pixel.wipro;

/* * This Java program finds the nth highest number in an array using for loops.
 * It iterates through the array n times, each time finding the maximum element
 * from the remaining unsorted portion of the array and placing it in the correct position.
 * * Example usage:
 * * Input: [4, 2, 9, 7, 5, 6, 3, 8, 1], n = 1
 * * Output: The 1st highest number is: 9
 * * Note: The method assumes that n is valid (1 <= n <= size of the array).
 */

public class NthHighestForLoops {
    public static void main(String[] args) {
        int[] nums = {4, 2, 9, 7, 5, 6, 3, 8, 1};
        int n = 1;
        System.out.println("The " + n + "rd highest number is: " + getNthHighest(nums, n));
    }
    // Method to find the nth highest number in an array
    public static int getNthHighest(int[] nums, int n) {
        int length = nums.length;

        // Iterate n times to find the nth highest number
        for (int i = 0; i < n; i++) {
            int maxIndex = i;

            // Find the largest element from i to the end of the array
            for (int j = i + 1; j < length; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found largest element with the i-th element using a separate method
            swapElements(nums, i, maxIndex);
        }

        // Return the nth highest (which is now at index n-1)
        return nums[n - 1];
    }
    // Separate method to swap two elements in the array
    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

