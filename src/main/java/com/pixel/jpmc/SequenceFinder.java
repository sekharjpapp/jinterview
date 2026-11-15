package com.pixel.jpmc;

import java.util.*;

public class SequenceFinder {

    public static List<List<Integer>> findSequences(String input) {
        if (input == null) throw new IllegalArgumentException("Input cannot be null");

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> run = new ArrayList<>();
        Integer prev = null;

        for (String tok : input.split("\\s+")) {
            Integer cur = null;
            try { cur = Integer.parseInt(tok); } catch (NumberFormatException ignored) {}

            if (cur != null && prev != null && cur - prev == 1) {
                if (run.isEmpty()) run.add(prev);
                run.add(cur);
            } else {
                if (run.size() >= 2) result.add(run);
                run = new ArrayList<>();
            }
            prev = cur;
        }
        if (run.size() >= 2) result.add(run);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSequences("1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1"));
    }
}
