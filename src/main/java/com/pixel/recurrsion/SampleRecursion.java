package com.pixel.recurrsion;

public class SampleRecursion {
    public static void main(String[] args) {
        printNumbers(5);
    }
    public static void printNumbers(int nums) {
        System.out.println(nums);
        if (nums <= 1) {
            return;
        }
        printNumbers(nums - 1);
    }
}
