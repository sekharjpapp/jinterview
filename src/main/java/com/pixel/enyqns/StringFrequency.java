package com.pixel.enyqns;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        Map<String, Long> strFrq = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(strFrq);
    }
}
