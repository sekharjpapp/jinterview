package com.pixel.wipro;

import java.util.ArrayList;

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
