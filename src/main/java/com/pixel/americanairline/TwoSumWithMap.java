package com.pixel.americanairline;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWithMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the value and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // Return the indices if the complement exists
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
