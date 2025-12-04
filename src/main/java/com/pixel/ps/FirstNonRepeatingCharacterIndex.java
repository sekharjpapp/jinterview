package com.pixel.ps;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterIndex {
    public static void main(String[] args) {
        String input = "swiss";
        int index = firstNonRepeatingCharacterIndex(input);
        System.out.println("First non-repeating character index: " + index);
    }
    public static int firstNonRepeatingCharacterIndex(String str) {
        if (str == null || str.isEmpty()) return -1;

        // Step 1: Count frequency of each character preserving order
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        // Step 2: Find the first character with count == 1
        Optional<Character> firstNonRepeatChar = freqMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        // Step 3: Return its index in the string
        return firstNonRepeatChar
                .map(ch -> str.indexOf(ch))
                .orElse(-1);
    }
}

