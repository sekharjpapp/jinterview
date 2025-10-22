package com.pixel.forlooptests;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForloopSample {
    public static void main(String[] args) {
        sampleOne();
        Map<Boolean, List<Integer>> evenOddMap =
                Stream.of(25, 15, 75, 35, 40, 5, 10, 55, 60, 80)
                        .collect(
                                Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even numbers: " + evenOddMap.get(true));
    }
    public static void sampleOne() {
        for (int num = 10 ; num > 0 ; num /= 2) {
            //System.out.println(num);{
            }
        }
    }

