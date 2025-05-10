package com.pixel.enyqns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicatesCustomLogic {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5, 1};

        // Call the method to remove duplicates
        int[] result = removeDuplicates(inputArray);

        // Print the result
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Array without duplicates: " + Arrays.toString(result));

    }
    public static int[] removeDuplicates(int[] array) {
        List<Integer> resultList = new ArrayList<>();

        // Traverse through each element
        for (int i = 0; i < array.length; i++) {
            // Check if the element is already in the result list
            if (!resultList.contains(array[i])) {
                resultList.add(array[i]);
            }
        }
        // Convert the resultList back to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
