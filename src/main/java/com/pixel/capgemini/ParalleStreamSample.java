package com.pixel.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParalleStreamSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

// Using parallel stream
        list.parallelStream().forEach(s -> {
            if (s.equals("C")) {
                list.remove(s);  // Can cause ConcurrentModificationException
            }
        });

    }
}
