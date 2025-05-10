package com.pixel.general;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveAString {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Orange", "Mango", "Grape");

        String subStrToRemove = "an";

        List<String> stringList = fruits.stream()
                .filter(w -> !w.contains(subStrToRemove))
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
