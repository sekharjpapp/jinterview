package com.pixel.dsabacktracking;

public class FebonachiSeries {
    public static void main(String[] args) {
        int n = 7; // Change this value to generate more or fewer terms
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    private static int fib(int i) {
        if (i <= 1) {
            return i;
        }
        return fib(i - 1) + fib(i - 2);
    }
}
