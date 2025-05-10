package com.pixel.capgemini;

public class MissingNumberFinder {
    public static void main(String[] args) {
        // Example array with one missing number
        int[] array = {1, 2, 4, 5, 6};  // Missing number is 3

        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;  // Since one number is missing, length should be n+1
        int expectedSum = n * (n + 1) / 2;  // Sum of first n natural numbers

        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum;  // Missing number is the difference
    }
}
