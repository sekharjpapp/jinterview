package com.pixel.j17;

public record Person(String name, String dob) {

    public Person(String name, String dob) {
        if (dob == null) {
            throw new IllegalArgumentException("DOB cannot be null");
        }
        this.name = name;
        this.dob = dob.replace('-', '/');
    }
}
