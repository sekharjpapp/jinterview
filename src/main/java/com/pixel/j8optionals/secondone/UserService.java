package com.pixel.j8optionals.secondone;

import java.util.Arrays;
import java.util.List;

public class UserService {

    public User getUserById(int id) {
        List<User> users = Arrays.asList(
                new User(1, "Alice"),
                new User(2, "Bob"),
                new User(3, "Charlie")
        );
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // user not found
    }
}
