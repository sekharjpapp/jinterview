package com.pixel.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Contains duplicate? " + containsDuplicate(nums));
    }

    private static String containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); // <Integer>

        for (int num : nums) {
            if (set.contains(num)) {
                return "true";
            }
            set.add(num);
        }

        return "false";
    }
}
