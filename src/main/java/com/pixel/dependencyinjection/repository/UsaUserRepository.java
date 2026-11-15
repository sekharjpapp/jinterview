package com.pixel.dependencyinjection.repository;

import com.pixel.dependencyinjection.model.UserRepo;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class UsaUserRepository implements UserRepository {

    private List<UserRepo> users = Arrays.asList(
            new UserRepo("Michael", "Brown"),
            new UserRepo("Sarah", "Williams"),
            new UserRepo("David", "Jones")
    );

    @Override
    public List<UserRepo> getAllUsers() {
        return users;
    }
}
