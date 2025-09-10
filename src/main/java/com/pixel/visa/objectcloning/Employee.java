package com.pixel.visa.objectcloning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Employee implements Cloneable {

    private int id;
    private String name;
    private int age;
    private String email;
    private String password;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


