package com.pixel.cignititech;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        // Reverse in place using Java 8
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
    public static void reverseArray(int[] array) {
        IntStream.range(0, array.length / 2)
                .forEach(i -> {
                    int temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                });
    }
}
