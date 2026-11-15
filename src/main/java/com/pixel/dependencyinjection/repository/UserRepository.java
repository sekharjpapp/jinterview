package com.pixel.dependencyinjection.repository;

import com.pixel.dependencyinjection.model.UserRepo;

import java.util.List;

public interface UserRepository {
    List<UserRepo> getAllUsers();
}
