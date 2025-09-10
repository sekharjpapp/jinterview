package com.pixel.visa;

/*
* int[] nums = {1, 5, 7, -1, 5}; int target = 6;
*   output: [1, 5]
            [-1, 7]
* */
import java.util.*;

public class FindPairsWithSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        int target = 6;
        List<int[]> pairs = findPairs(nums, target);
        //pairs.forEach(pair -> System.out.println(Arrays.toString(pair)));
        for (int[] p : pairs) {
            System.out.println(Arrays.toString(p));
        }
    }
    public static List<int[]> findPairs(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> used = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for (int num : nums) {
            int complement = target - num;

            if (seen.contains(complement)) {
                //System.out.println("num=" + num + ", comp=" + (target - num) + ", seen=" + seen);
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String key = a + ":" + b;

                if (!used.contains(key)) {
                    result.add(new int[]{a, b});
                    used.add(key);
                }
            }
           seen.add(num);
        }
        return result;
    }
}
