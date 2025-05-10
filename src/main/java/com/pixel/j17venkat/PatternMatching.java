package com.pixel.j17venkat;

import java.util.List;

public class PatternMatching {
    public static void main(String[] args) {
        List.of(101,100,95,89,77,67,57)
                .stream()
                .map(PatternMatching::grade)
                .forEach(System.out::println);
    }

    private static String grade(int score) {
        var grade = switch (Math.min(score / 10, 10)) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> {
                System.out.println("logging ...");
                yield "C";
            }
            case 6 -> "D";
            default -> "F";
        };
        return "Grade for " + score + " is " +grade;
    }
}
