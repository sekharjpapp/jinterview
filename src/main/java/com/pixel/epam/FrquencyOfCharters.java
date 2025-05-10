package com.pixel.epam;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrquencyOfCharters {
    public static void main(String[] args) {
        String str = "hello world";

        Map<String, Long> stringLongMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);
    }
}
