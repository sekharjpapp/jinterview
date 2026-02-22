package com.pixel.sapient;

import java.util.*;
import java.util.stream.Collectors;

public class SortingByKey {
    public static void main(String[] args) {
        // Create dummy data using Map.of()
        Map<Double, List<Student>> map = Map.of(
                3.5, List.of(
                        new Student(101, "Ravi"),
                        new Student(102, "Anil")
                ),
                1.8, List.of(
                        new Student(103, "Kiran")
                ),
                2.7, List.of(
                        new Student(104, "Sita"),
                        new Student(105, "Meena")
                )
        );
        // Sort by keys
        Map<Double, List<Student>> sortedMap =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));

        sortedMap.forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("*****************************************");
        Map<Double, List<Student>> sortedMap1 = new TreeMap<>(Comparator.naturalOrder());

        sortedMap1.putAll(map);
        sortedMap1.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
record Student(Integer id, String name) {}