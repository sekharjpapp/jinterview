package com.pixel.j8optionals;

import java.util.Optional;

public class SampleOptionals {
    public static void main(String[] args) {
        Optional<Cat> fred = getCatByName();
        System.out.println("Cat's name: " + fred.map(Cat::name));
    }
    private static Optional<Cat> getCatByName() {
        Cat cat = new Cat("Fred", 5);
        return Optional.of(cat);
    }
}
record Cat(String name, Integer age) {}