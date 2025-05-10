package com.pixel.partations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name;
    private String deptName;
    private double salary;
    private double maxSalary;

    public Employee(String name, String deptName, double salary) {
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
    }

}
