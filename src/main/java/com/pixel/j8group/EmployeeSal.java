package com.pixel.j8group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSal {

    private int id;
    private String name;
    private String department;
    private double salary;
}
