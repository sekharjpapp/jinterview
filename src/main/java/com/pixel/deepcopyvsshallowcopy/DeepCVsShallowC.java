package com.pixel.deepcopyvsshallowcopy;

import java.util.Arrays;

public class DeepCVsShallowC {
    public static void main(String[] args) {
        Person joe = new Person("Joe", "01/01/1990");
        Person jim = new Person("Jim", "02/02/1992");
        Person jack = new Person("Jack", "03/03/1993");
        Person jane = new Person("Jane", "04/04/1994");
        Person jill = new Person("Jill", "05/05/1995");

        Person[] people = {joe, jim, jack, jane, jill};
        Person[] peopleShallowCopy = Arrays.copyOf(people, people.length);
    }
}
record Person(String name,String dob) {}