package com.pixel.epam;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamReuse {
    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream.forEach(System.out::println);
        // Attempting to reuse the same stream will cause an IllegalStateException
       // numberStream.forEach(System.out::println); // This line will throw an exception

        Supplier<Stream<Integer>> streamSupplier = () -> Stream.of(1, 2, 3, 4, 5);

        streamSupplier.get().forEach(System.out::println);
        streamSupplier.get().forEach(System.out::println); // OK

    }
}
