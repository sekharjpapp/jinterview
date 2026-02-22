package com.pixel.j8only;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IgnoreNumbers {
    public static void main(String[] args) {
        final Integer[] ignore = new Integer[]{500, 1000, 1500, 2000, 2500, 3000, 3500, 4000,4500,5000};
        final List<Integer> ignoreList = Arrays.asList(ignore);

        try (final IntStream stream = IntStream.rangeClosed(500, 5000)) {
            stream.filter(x -> !ignoreList.contains(x)).forEach(System.out::println);
        } catch (Exception e){ e.printStackTrace(); }
    }
}
