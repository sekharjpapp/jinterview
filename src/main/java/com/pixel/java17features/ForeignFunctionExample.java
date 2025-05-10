package com.pixel.java17features;

public class ForeignFunctionExample {
    static class Person {
        String name;
        Address address;

        public String getName() {
            return name;
        }

        public Address getAddress() {
            return address;
        }
    }

    static class Address {
        String city;

        public String getCity() {
            return city;
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        // person.name = "John"; // Uncommenting this line will prevent the NPE

        // This line will throw a NullPointerException because person.name is null
        System.out.println("Person's name length: " + person.getName().length());

        // This line will throw a NullPointerException because person.address is null
        System.out.println("Person's city: " + person.getAddress().getCity());
    }
}
