package com.pixel.githubsample;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
    // method to for prime number

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
