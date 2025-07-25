package com.pixel.recurrsion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
