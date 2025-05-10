package com.pixel.cignititech;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalAbstraction {
    // A higher-order function that abstracts the transformation logic
    public static <A, B> List<B> transformList(List<A> list, Function<A, B> transform) {
        return list.stream()
                .map(transform)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Defining the transformation functions
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> doubled = x -> x * 2;
        Function<Integer, Integer> addition = x -> x + 1;

        // Using the transformList function with different transformations
        List<Integer> squaredNumbers = transformList(numbers, square);
        List<Integer> doubledNumbers = transformList(numbers, doubled);
        List<Integer> addtionPlusOneNumbers = transformList(numbers, addition);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Squared numbers: " + squaredNumbers);
        System.out.println("Doubled numbers: " + doubledNumbers);
        System.out.println("Doubled numbers: " + addtionPlusOneNumbers);
    }
}
