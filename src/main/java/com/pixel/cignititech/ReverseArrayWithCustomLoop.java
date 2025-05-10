package com.pixel.cignititech;

import java.util.Arrays;

public class ReverseArrayWithCustomLoop {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        // Create a reversed array with a manual loop in streams
        int[] reversedArray = Arrays.stream(array)
                .boxed()
                .sorted((a, b) -> -1) // Reverses the order
                .mapToInt(Integer::intValue)
                .toArray();

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}
