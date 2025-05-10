package com.pixel.ps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortWithStream {
    public static void main(String[] args) {
        List<EmployeeSort> employees = Arrays.asList(
                new EmployeeSort("John", 60000),
                new EmployeeSort("Emma", 75000),
                new EmployeeSort("Michael", 50000),
                new EmployeeSort("Olivia", 90000)
        );

        // Sort employees by salary using Stream API
        List<EmployeeSort> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(EmployeeSort::getSalary).thenComparing(EmployeeSort::getName))
                .toList();

        // Print sorted employees
        sortedEmployees.forEach(System.out::println);
    }
}
