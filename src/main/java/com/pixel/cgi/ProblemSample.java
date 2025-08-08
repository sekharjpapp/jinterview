package com.pixel.cgi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProblemSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,92,47,92,20,66,42,28,47);

        List<Integer> duplicatesNums = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicatesNums);

       empSal.stream()
                .soreted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        /*
             SELECT salary
             FROM Employee
             Order By salary DESC
             LIMIT 1 OFFSET 1;

         */

    }
}
