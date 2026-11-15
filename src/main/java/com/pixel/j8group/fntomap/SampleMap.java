package com.pixel.j8group.fntomap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleMap {
    public static void main(String[] args) {
        var dev = Stream.of("James","Duke", "Alexander", "Tom");

        var devMap = dev.collect(Collectors.toMap(Function.identity(), String::length))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(devMap);

    }
}
