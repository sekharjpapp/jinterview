package com.pixel.altimetrik;

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

