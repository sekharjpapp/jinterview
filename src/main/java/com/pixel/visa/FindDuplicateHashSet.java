package com.pixel.visa;

import java.util.*;

public class FindDuplicateHashSet {
    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // should never happen
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate: " + findDuplicate(nums)); // Output: 2
    }
}
