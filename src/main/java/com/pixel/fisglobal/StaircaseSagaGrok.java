package com.pixel.fisglobal;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class StaircaseSagaGrok {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] testCases = {2, 1};
        int[] expectedOutputs = {4, 4};

        for (int i = 0; i < testCases.length; i++) {
            int input = testCases[i];
            int result = solution.gameOfStairs(input);
            System.out.println("Input: " + input);
            System.out.println("Output: " + result);
            System.out.println("Expected: " + expectedOutputs[i]);
            System.out.println("Pass: " + (result == expectedOutputs[i] ? "Yes" : "No"));
            System.out.println();
        }
    }
}
@Data
class State {
    int position;
    int num_up_moves;
    boolean last_move_down;

    State(int p, int n, boolean l) {
        position = p;
        num_up_moves = n;
        last_move_down = l;
    }
}
class Solution {
    private int M;
    private Map<State, Integer> memo;
    private int min_position;
    private int max_position;

    public int gameOfStairs(int input) {
        M = input;
        memo = new HashMap<>();
        // Set bounds
        min_position = -input * 2;
        max_position = input * 4;
        return dp(1, 0, false);
    }

    private int dp(int position, int num_up_moves, boolean last_move_down) {
        if (position == M) {
            return 1;
        }
        if (position < min_position || position > max_position) {
            return 0;
        }
        State current_state = new State(position, num_up_moves, last_move_down);
        if (memo.containsKey(current_state)) {
            return memo.get(current_state);
        }
        int ways = 0;
        // Up move
        int step_size = (int) Math.pow(2, num_up_moves);
        int new_position = position + step_size;
        ways += dp(new_position, num_up_moves + 1, false);
        // Down move
        if (!last_move_down) {
            new_position = position - 1;
            ways += dp(new_position, num_up_moves, true);
        }
        memo.put(current_state, ways);
        return ways;
    }
}