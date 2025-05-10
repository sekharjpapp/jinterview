package com.pixel.lambdaexpression;

import java.util.List;

public class EmployeeClient {
    public static void main(String[] args) {

        List<Emp> emps = List.of(new Emp(1, "sachin", "IT"),
                new Emp(2, "Tom", "HR"),
                new Emp(3, "Jim", "Dev"));
        long count = emps.stream()
                .map(Emp::getDepartment)
                .count();
        System.out.println(count);
    }
}
