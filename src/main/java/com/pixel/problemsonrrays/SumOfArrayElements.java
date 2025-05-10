package com.pixel.problemsonrrays;

public class SumOfArrayElements {
    public static void main(String[] args) {

        int[] nums = {4,6,8,9};

        System.out.println(sumOfArray(nums));
        System.out.println(smallestNumber(nums));
        System.out.println(maxNumber(nums));
    }
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num:arr) {
            sum += num;
        }
        return sum;
    }
    public static int smallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num:arr) {
            if (num < min ) {
                min = num;
            }
        }
        return min;
    }
    public static int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num:arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
