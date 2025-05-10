package com.pixel.general;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupsElementsByitsLength {
    public static void main(String[] args) {

        List<String> fruits = List.of("Apple", "Banana", "Orange", "Mango", "Grape");

        Map<Integer, List<String>> groupBy = fruits.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupBy);
    }
}
