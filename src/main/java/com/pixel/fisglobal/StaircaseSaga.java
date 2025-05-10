package com.pixel.fisglobal;

public class StaircaseSaga {

    public int gameOfStairs(int input1) {
        if (input1 < 0) return 0;
        int maxStair = input1 + 32; // Heuristic to cover enough steps

        int[] dpUp = new int[maxStair + 2];
        int[] dpDown = new int[maxStair + 2];

        // Base case: starting at stair 1
        dpUp[1] = 1;

        // Compute dpUp for all stairs up to maxStair
        for (int i = 0; i <= maxStair; i++) {
            for (int power = 0; ; power++) {
                int step = 1 << power;
                if (step > i) break;
                int prev = i - step;
                if (prev >= 0) {
                    dpUp[i] += dpUp[prev] + dpDown[prev];
                }
            }
            // Compute dpDown for previous stair (i-1)
            if (i > 0) {
                dpDown[i - 1] = (i <= maxStair) ? dpUp[i] : 0;
            }
        }

        return dpUp[input1] + dpDown[input1];
    }

    public static void main(String[] args) {
        StaircaseSaga solution = new StaircaseSaga();
        System.out.println(solution.gameOfStairs(2)); // Output: 4
        System.out.println(solution.gameOfStairs(1)); // Output: 4
    }
}
