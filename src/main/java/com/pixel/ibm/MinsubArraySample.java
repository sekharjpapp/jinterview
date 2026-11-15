package com.pixel.ibm;

public class MinsubArraySample {
    public static void main(String[] args) {
        int target = 7; int[] nums = {2,3,1,2,4,3};
        System.out.println(minsubArray(target, nums));
    }
    public static int minsubArray(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            // 1. Expand the window
            currentSum += nums[right];

            // 2. Shrink the window while the condition is met
            while (currentSum >= target) {
                // Update the minimum length found so far
                minLength = Math.min(minLength, right - left + 1);

                // Remove the leftmost element and move the left pointer
                currentSum -= nums[left];
                left++;
            }
        }

        // 3. If minLength was never updated, no valid subarray exists
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
