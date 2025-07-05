package com.pixel.wipro;

import java.util.ArrayList;

/** * This class provides a method to find the nth highest number in a list of integers.
 * It iteratively finds the maximum number and removes it from the list until the nth highest is found.
 * * Example usage:
 * * Input: [10, 30, 50, 20, 40], n = 4
 * * Output: The 4th highest number is: 20
 * * Note: The method assumes that n is valid (1 <= n <= size of the list).
 * * This implementation is not the most efficient for large lists, but it demonstrates the concept clearly.
 */

public class NthHighestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        int n = 4; // Example: 2nd highest number
        System.out.println("The " + n + "th highest number is: " + getNthHighest(numbers, n));

    }
    public static int getNthHighest(ArrayList<Integer> list, int n) {
        int nthHighest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int num : list) {
                if (num > max) {
                    max = num;
                }
            }
            // After finding the current maximum, remove it for the next iteration
            list.remove(Integer.valueOf(max));
            nthHighest = max; // Update the nth highest
        }
        return nthHighest;
    }
}
