package com.pixel.optum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeOptum {
    private int id;
    private String name;
    private double sal;
    private String department;
}
