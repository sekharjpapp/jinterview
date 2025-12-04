package com.pixel.mongodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
public class User {
    private String name;
    private int age;

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("Sahil", 30));
        users.add(new User("Sahil", 30)); // This will be considered duplicate
        users.add(new User("Sushil", 35));
        System.out.println(users.size()); // Output: 3
    }
}
