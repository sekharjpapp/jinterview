package com.pixel.cignititech;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayJava8 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        // Reverse the array using Java 8 IntStream
        int[] reversedArray = IntStream.range(0, array.length)
                .map(i -> array[array.length - 1 - i])
                .toArray();

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

    }
}
