package com.pixel.dp.decoratorpattern;

import java.time.Duration;
import java.time.Instant;
import java.util.function.UnaryOperator;

public class Sample {
    // Separate log method
    static UnaryOperator<UnaryOperator<String>> log() {
        return delegate -> input -> {
            System.out.println("in: " + input);
            String result = delegate.apply(input);
            System.out.println("out: " + result);
            return result;
        };
    }
    // Separate performance method
    static UnaryOperator<UnaryOperator<String>> perf() {
        return delegate -> input -> {
            Instant start = Instant.now();
            try {
                return delegate.apply(input);
            } finally {
                Duration duration = Duration.between(start, Instant.now());
                System.out.println("took: " + duration.toMillis() + " ms");
            }
        };
    }
    public static void main(String[] args) {
        // Business logic
        UnaryOperator<String> greet = name -> "Hello " + name;
        // Compose decorators
        UnaryOperator<String> service = log().andThen(perf()).apply(greet);
        // Execute
        System.out.println(service.apply("Duke"));
    }
}
