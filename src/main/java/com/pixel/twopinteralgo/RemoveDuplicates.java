package com.pixel.twopinteralgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
      int[]  arr = {1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(arr);
        System.out.println("New length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(arr, 0, newLength)));
        Map<String,String> map = new HashMap<>();
    }
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Edge case: empty array
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // Move unique element forward
            }
        }
        return i + 1; // Return count of unique elements
    }

}
