package com.pixel.dependencyinjection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRepo {

    private String firstName;
    private String lastName;
}
