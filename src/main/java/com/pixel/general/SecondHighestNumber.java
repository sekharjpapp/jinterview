package com.pixel.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] numbers = {3,6,11,16};

        Integer secondHigestNumber = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(secondHigestNumber);
    }
}
