package com.pixel.wiproint;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleInt {
    public static void main(String[] args) {
        String a = "abccccdeeeffffg";

        Map<Character, Long> charCount = a.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(charCount);

        Map<String, Long> charCount1 = Arrays.stream(a.split("")) // Convert to Stream<String>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount1);

        Map<String, Long> collect = Arrays.stream(a.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
