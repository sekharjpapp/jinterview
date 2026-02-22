package com.pixel.j17;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListFaster {
    public static void main(String[] args) {
        var begin = Instant.now();
        var list = Stream.iterate(0, n-> n < 100_000_000, n-> ++n)
        //                 .toList();
                .collect(Collectors.toList());
        var duration = Duration
                .between(begin,Instant.now());
        System.out.println("%d in %s".formatted(list.size(), duration));
    }
}
