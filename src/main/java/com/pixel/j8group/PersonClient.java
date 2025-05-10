package com.pixel.j8group;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonClient {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", 30),
                new Person("Jane", "Doe", 25),
                new Person("Alice", "Smith", 35),
                new Person("Bob", "Smith", 40)
        );
        Comparator<Person> personComparator = Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparing(Person::getAge);

        people.sort(personComparator);
        System.out.println(people);
    }
}
