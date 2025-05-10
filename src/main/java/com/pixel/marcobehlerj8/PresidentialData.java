package com.pixel.marcobehlerj8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PresidentialData {
    public static List<Wife> wifesOfDonaldTrump = Arrays.asList(
            new Wife("Melania", Arrays.asList(new Child("Barron", 12))),
            new Wife("Marla", Arrays.asList(new Child("Tiffany", 24))),
            new Wife("Ivana", Arrays.asList(
                    new Child("Donald Trump Jr.", 40),
                    new Child("Ivanka", 36),
                    new Child("Eric", 34)
            ))
    );

    public static List<Potus> potuses = Arrays.asList(
            new Potus("Donald", "Trump", 2016, "Republican", wifesOfDonaldTrump),
            new Potus("Barack", "Obama", 2012, "Democratic"),
            new Potus("Barack", "Obama", 2008, "Democratic"),
            new Potus("George W.", "Bush", 2004, "Republican"),
            new Potus("George W.", "Bush", 2000, "Republican"),
            new Potus("Bill", "Clinton", 1996, "Democratic"),
            new Potus("Bill", "Clinton", 1992, "Democratic"),
            new Potus("George H.W.", "Bush", 1988, "Republican"),
            new Potus("Ronald", "Reagan", 1984, "Republican"),
            new Potus("Ronald", "Reagan", 1980, "Republican"),
            new Potus("Jimmy", "Carter", 1976, "Democratic")
    );
    public static void main(String[] args) {
        Potus trump = potuses.get(0);

        Map<Integer, Child> childernAge = trump.wives().stream()
                .flatMap(wife -> wife.children().stream())
                .sorted(Comparator.comparing(Child::age).reversed())
                .collect(Collectors.toMap(Child::age, Function.identity()));
        System.out.println(childernAge);
    }
}
record Child(String name, int age) {}

record Wife(String name, List<Child> children) {}

record Potus(String firstName, String lastName, int electionYear, String party, List<Wife> wives) {
    // Overloaded constructor for Potus without wives
    Potus(String firstName, String lastName, int electionYear, String party) {
        this(firstName, lastName, electionYear, party, Collections.emptyList());
    }
}
