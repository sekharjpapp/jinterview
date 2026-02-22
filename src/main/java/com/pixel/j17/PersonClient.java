package com.pixel.j17;

public class PersonClient {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "1990-01-01");
        System.out.println("Name: " + person.name());
        System.out.println("DOB: " + person.dob());
    }
}
