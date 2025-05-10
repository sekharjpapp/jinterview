package com.pixel.loops;

public class IntroLoops {
    public static void main(String[] args) {
        printNumbers(5);
    }
    public static void printNumbers(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
