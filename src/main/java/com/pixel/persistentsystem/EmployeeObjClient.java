package com.pixel.persistentsystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeObjClient {
    public static void main(String[] args) {
        List<EmployeeObj> employees = new ArrayList<>();
        employees.add(new EmployeeObj(1, "John Doe", 30));
        employees.add(new EmployeeObj(2, "Jane Doe", 25));
        employees.add(new EmployeeObj(3, "Bob Smith", 28));
        employees.add(new EmployeeObj(4, "Alice Johnson", 35));

        List<EmployeeObj> filteredEmployees = employees.stream()
                .filter(employee -> employee.getAge() > 25)
                .collect(Collectors.toList());

        System.out.println(filteredEmployees);
    }
}
