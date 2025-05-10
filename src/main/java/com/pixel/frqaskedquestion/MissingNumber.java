package com.pixel.frqaskedquestion;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println("Missing number: " + findMissingNumber(arr));
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
