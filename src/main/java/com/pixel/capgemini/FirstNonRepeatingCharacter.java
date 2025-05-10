package com.pixel.capgemini;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String word = "success";
        Character firstNonRepeat = findFirstNonRepeatingCharacter(word);
        if (firstNonRepeat != null) {
            System.out.println("First non-repeating character: " + firstNonRepeat);
        } else {
            System.out.println("No non-repeating character found.");
        }
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("success");
        System.out.println(stringSet);
        System.out.println("--------------------------");
        System.out.println(findFirstNonRepeatingChar(word));
    }
    public static Character findFirstNonRepeatingCharacter(String word) {

        return word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
    public static String findFirstNonRepeatingChar(String word) {
        String firstChar = Arrays.stream(word.split("")).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        return firstChar;
    }

}
