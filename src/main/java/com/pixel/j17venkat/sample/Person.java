package com.pixel.j17venkat.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Person {

    private final String name;
    private final Gender gender;
    private final int age;
}
