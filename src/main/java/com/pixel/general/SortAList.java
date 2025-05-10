package com.pixel.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAList {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Orange", "Mango", "Grape");
        List<String> stringList = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
