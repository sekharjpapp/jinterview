package com.pixel.cignititech;

import java.util.List;
import java.util.function.Predicate;

public class SumSelector {
    public static int totalSelectValues(List<Integer> list, Predicate<Integer> selector) {
        return list.stream()
                .filter(selector)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        int evenSum = totalSelectValues(numbers, num -> num % 2 == 0);
        int oddSum = totalSelectValues(numbers, num -> num % 2 != 0);
        int graterThanFour = totalSelectValues(numbers, num -> num > 4);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of odd numbers: " + graterThanFour);
    }
}
