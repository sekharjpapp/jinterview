package com.pixel.recursion;

public class FibonacciTailRecursion {
    public static void main(String[] args) {
        int n = 500;
        System.out.println("Fibonacci(" + n + ") = " + fibTail(n));
    }
    // Tail recursion - recursive call is the last operation
    public static int fibTail(int n) {
        return fibTailHelper(n, 0, 1);
    }

    // Helper function with accumulators
    private static int fibTailHelper(int n, int a, int b) {
        // Base case
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }

        // Tail recursive call - last operation
        return fibTailHelper(n - 1, b, a + b);
    }
}
