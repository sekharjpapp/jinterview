package com.pixel.optum;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGrouping {
    public static void main(String[] args) {
        //List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "god", "dog");
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "god", "dog"};
       // anagramGrouping(words);
        anagramStringGrouping(words);
    }
    public static void anagramGrouping(List<String> words) {
        Map<String, List<String>> anagramList = words.stream()
                .collect(Collectors.groupingBy(
                        word -> {
                            char[] charArray = word.toCharArray();
                            Arrays.sort(charArray);
                            return new String(charArray);
                        }));
        anagramList.forEach((k,v)-> System.out.println("Anagrams are: " + v));
    }
    public static void anagramStringGrouping(String[] words) {
        Map<String, List<String>> anagramList = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        word -> {
                            char[] charArray = word.toCharArray();
                            Arrays.sort(charArray);
                            return new String(charArray);
                        }));
        anagramList.forEach((k,v)-> System.out.println("Anagrams are: " + v));
    }
}
