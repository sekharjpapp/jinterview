package com.pixel.leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // Pointer to place the next non-zero element

        // Move all non-zero elements to the beginning of the array
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                // Swap the current element with the element at lastNonZeroFoundAt
                swap(nums, lastNonZeroFoundAt, current);
                lastNonZeroFoundAt++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
