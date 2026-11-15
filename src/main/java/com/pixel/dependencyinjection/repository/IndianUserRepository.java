package com.pixel.dependencyinjection.repository;

import com.pixel.dependencyinjection.model.UserRepo;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class IndianUserRepository implements UserRepository {

    private List<UserRepo> users = Arrays.asList(
            new UserRepo("Aarav", "Sharma"),
            new UserRepo("Priya", "Patel"),
            new UserRepo("Rahul", "Kumar"),
            new UserRepo("Sneha", "Reddy")
    );

    @Override
    public List<UserRepo> getAllUsers() {
        return users;
    }
}
