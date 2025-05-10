package com.pixel.persistentsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeObj {
    private int id;
    private String name;
    private int age;
}
