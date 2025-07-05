package com.pixel.j17venkat.sample;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> people = PersonRepository.createPeople();
        Map<String, List<Integer>> stringListMap = people.stream()
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.mapping(Person::getAge, Collectors.toList())));
        System.out.println(stringListMap);

    }
}
