package com.pixel.atnadt;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class MissingNumbersInArray {

    public static List<Integer> findMissingNumbers(int[] arr, int n) {
        HashSet<Integer> numberSet = new HashSet<>();
        for (int num : arr) {
            numberSet.add(num);
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!numberSet.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};  // Example input array
        int n = 8;  // Maximum number in the range
        List<Integer> missingNumbers = findMissingNumbers(arr, n);
        System.out.println("Missing numbers: " + missingNumbers);
    }
}
