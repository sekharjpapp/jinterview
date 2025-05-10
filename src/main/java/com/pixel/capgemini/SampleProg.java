package com.pixel.capgemini;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleProg {
    public static void main(String[] args) {
        //
        String str = "hello";

        String longs = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(w -> w.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().get();
        System.out.println(longs);

        // employee , id, gender, name, salary
        // count the number of emp by gender
//        listOfEmployees.stream()
//                .collect(Collectors.groupingBy(Employee::getGender(), Collectors.counting())

        //
    }
}
