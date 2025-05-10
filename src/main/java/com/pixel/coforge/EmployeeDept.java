package com.pixel.coforge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDept {
    private int id;
    private String name;
    private String dept;
    private double salary;
}
