package com.pixel.altimetrik;
/*
* MinimumJumps : Given an array of non-negative integers where each element represents the maximum jump length at that position,
* write a function to determine the minimum number of jumps required to reach the last index of the array starting from the first index.
* If it is not possible to reach the end, return -1.
* * Example:
* Input: [1, 4, 1, 8, 9, 2, 6, 7, 6, 8, 9]
* Output: 3
* Explanation: The minimum number of jumps to reach the last index is 3. Jump 1 step from index 0 to 1,
* then 4 steps to index 5, and finally 4 steps to the last index.
* Input: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
* Output: 10
* Explanation: The minimum number of jumps to reach the last index is 10. You need to make a jump of 1 step at each index.
* Input: [0, 1, 1, 1]
* Output: -1
* Explanation: It is not possible to reach the last index from the first index since the first element is 0.
* */
public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 1, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr3 = {0, 1, 1, 1}; // End is not reachable

        System.out.println("Minimum jumps (arr1): " + minJumps(arr1)); // Output: 3
        System.out.println("Minimum jumps (arr2): " + minJumps(arr2)); // Output: 10
        System.out.println("Minimum jumps (arr3): " + minJumps(arr3)); // Output: -1
    }

    public static int minJumps(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0; // No jumps needed if array has 1 or no element
        }
        if (arr[0] == 0) {
            return -1; // Cannot move if the first element is 0
        }

        int jumps = 0;
        int farthest = 0;
        int currentEnd = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            // Update the farthest index we can reach
            farthest = Math.max(farthest, i + arr[i]);

            // If we reach the end of the current range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // If currentEnd reaches or exceeds the last index, we are done
                if (currentEnd >= arr.length - 1) {
                    return jumps;
                }
            }
        }

        // If we exit the loop without reaching the end, return -1
        return -1;
    }
}

