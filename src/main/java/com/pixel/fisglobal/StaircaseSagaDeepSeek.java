package com.pixel.fisglobal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StaircaseSagaDeepSeek {
    private static Map<String, Integer> memo = new HashMap<>();
    private static final int MOD = 1000000007;

    public int gameOfStairs(int input1) {
        memo.clear();
        return (ways(input1, 1, false) * 2) % MOD;
    }

    private int ways(int target, int current, boolean lastDown) {
        if (current == target) {
            return (target == 1) ? 2 : 1;
        }
        if (current > target + 1) {
            return 0;
        }
        String key = current + "," + lastDown;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int count = 0;
        for (int k = 0;; k++) {
            int jump = (int) Math.pow(2, k);
            int newCurrent = current + jump;
            if (newCurrent > target + 1) {
                break;
            }
            count = (count + ways(target, newCurrent, false)) % MOD;
        }
        if (!lastDown && current > 1) {
            count = (count + ways(target, current - 1, true)) % MOD;
        }
        memo.put(key, count);
        return count;
    }

    public static void main(String[] args) {
        StaircaseSagaDeepSeek solver = new StaircaseSagaDeepSeek();
        System.out.println(solver.gameOfStairs(2)); // Expected output: 4
        System.out.println(solver.gameOfStairs(1)); // Expected output: 4

        // Additional tests:
        //System.out.println("gameOfStairs(3): " + solver.gameOfStairs(3)); // Example: output might be 3
        //System.out.println("gameOfStairs(4): " + solver.gameOfStairs(4)); // Example: output might be 2
        int[] arr = {4,5,6};
        List<Integer> collect = Arrays.stream(arr).boxed().toList();
    }
}
