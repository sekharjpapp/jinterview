package com.pixel.goldmansches;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        System.out.println(checkIfpanagram(sentence));
    }
    public static boolean checkIfpanagram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        for (int i = 'a'; i<='z'; i++) {
            alphabetSet.add((char)i);
        }
        for (int i=0; i<sentence.length();i++) {
            alphabetSet.remove(sentence.charAt(i));
            if (alphabetSet.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
