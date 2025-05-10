package com.pixel.americanairline;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class PseudoRandomNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> first = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();
        System.out.println(first.get());
    }
    public static IntStream getPseudoInts(String algorithm, int streamSize) {
        // returns an IntStream with size @streamSize of random numbers generated using the @algorithm
        // where the lower bound is 0 and the upper is 100 (exclusive)
        return RandomGeneratorFactory.of(algorithm)
                .create()
                .ints(streamSize, 0,100);
    }
}
