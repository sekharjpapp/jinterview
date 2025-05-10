package com.pixel.lambdaexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private int id;
    private String name;
    private String department;

    public Emp(int i, String sachin, String it, int i1) {
    }
}
