package com.pixel.leetcode;

public class MoveZeroesEasySol {
    public static void main(String[] args) {
/*
        Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        Example 2:
        Input: nums = [0]
        Output: [0]
*/
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("Array after moving zeroes: " + java.util.Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int nonzero = 0; // Pointer to place the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the element at `nonzero`
                int temp = nums[i];
                nums[i] = nums[nonzero];
                nums[nonzero] = temp;
                nonzero++; // Increment the nonzero pointer
            }
        }
    }
}
