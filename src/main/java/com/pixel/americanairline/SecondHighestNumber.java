package com.pixel.americanairline;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 9, 1};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Traverse through the array to find the highest and second-highest numbers
        for (int j : arr) {
            if (j > highest) {
                secondHighest = highest;
                highest = j;
            } else if (j > secondHighest && j != highest) {
                secondHighest = j;
            }
        }
        System.out.println("The second highest number is: " + secondHighest);
    }
}

