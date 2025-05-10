package com.pixel.cignititech;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayAsIs {
    public static void main(String[] args) {
        int[] array = {3,5,6,8,5,9};

        Integer[] array1 = IntStream.range(0, array.length)
                .mapToObj(reverse -> array[array.length - 1 - reverse])
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));

    }
}
