package com.pixel.listmapconvert;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListToMap {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", 30),
                new User("Bob", 25),
                new User("Charlie", 35),
                new User("Charlie", 35)
        );
        users.stream()
                .collect(Collectors.toMap(
                        user -> user.getName(),
                        user -> user.getAge(),
                        (existingValue, newValue) -> existingValue // Handle duplicates by keeping the existing value
                ))
                .forEach((name, age) -> System.out.println(name + ": " + age));
        System.out.println("-----------------------------------------------");
        Map<String, Integer> userMap = new HashMap<>();
        for (User user : users) {
            if (!userMap.containsKey(user.getName())) {
                userMap.put(user.getName(), user.getAge());
            }
            // If the name already exists, we skip or handle it as per requirement
            // You could add logic here to merge values if needed
        }

        for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
@Data
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}