package com.pixel.envenoddthreads;

import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class EvenOddPrinter {
    public static void main(String[] args) {
        int maxNumber = 10; // Print numbers up to this value

        CompletableFuture<Void> evenFuture = CompletableFuture.runAsync(() -> {
            IntStream.rangeClosed(1, maxNumber)
                    .filter(n -> n % 2 == 0)
                    .forEach(System.out::println);
        });

        CompletableFuture<Void> oddFuture = CompletableFuture.runAsync(() -> {
            IntStream.rangeClosed(1, maxNumber)
                    .filter(n -> n % 2 != 0)
                    .forEach(System.out::println);
        });

        CompletableFuture.allOf(evenFuture, oddFuture).join();
    }
}