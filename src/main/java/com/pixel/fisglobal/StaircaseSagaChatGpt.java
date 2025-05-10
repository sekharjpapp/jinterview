package com.pixel.fisglobal;

public class StaircaseSagaChatGpt {
    public int gameOfStairs(int input1) {
        int M = input1;
        int result = 0;
        int k = 0;

        // Loop over possible numbers of Up moves.
        // We stop when the required Down moves (d = 2^k - M) exceed the available gaps (k+1).
        while (true) {
            long power = 1L << k;  // Computes 2^k.
            if (power < M) {
                // Not enough upward movement; try a higher k.
                k++;
                continue;
            }
            int d = (int)(power - M);  // Number of Down moves needed.
            if (d > k + 1) {
                // Down moves cannot be placed (since there are only k+1 gaps); break out.
                break;
            }
            result += binom(k + 1, d);
            k++;
        }
        return result;
    }

    // Helper method to compute the binomial coefficient C(n, r)
    private int binom(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        r = Math.min(r, n - r);  // Use symmetry: C(n, r) = C(n, n-r)
        int c = 1;
        for (int i = 0; i < r; i++) {
            c = c * (n - i) / (i + 1);
        }
        return c;
    }
    public static void main(String[] args) {
        StaircaseSaga saga = new StaircaseSaga();
        System.out.println("gameOfStairs(1): " + saga.gameOfStairs(1)); // Expected output: 4
        System.out.println("gameOfStairs(2): " + saga.gameOfStairs(2)); // Expected output: 4
        // Additional tests:
        System.out.println("gameOfStairs(3): " + saga.gameOfStairs(3)); // Example: output might be 3
        System.out.println("gameOfStairs(4): " + saga.gameOfStairs(4)); // Example: output might be 2

    }
}
