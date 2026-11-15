package com.pixel.dependencyinjection.service;

import com.pixel.dependencyinjection.model.UserRepo;
import com.pixel.dependencyinjection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    @Qualifier("usaUserRepository") // or "usaUserRepository"
    private UserRepository userRepository;

    public List<UserRepo> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
