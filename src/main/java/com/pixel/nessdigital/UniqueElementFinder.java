package com.pixel.nessdigital;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueElementFinder {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 2, 1);
        System.out.println(findUnique(input));

        List<Integer> distinctList = input.stream()
                .distinct()
                .collect(Collectors.toList());
        //System.out.println(distinctList);

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
    private static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> collect = numbers.stream()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(nums -> nums.getValue() == 1)
                .map(Map.Entry::getKey)
                //.findFirst().get();
                .collect(Collectors.toList());
        return collect;
    }

}
