package com.pixel.partations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxSalaryByDepartment {
    public static void main(String[] args) {
        // Sample data
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 50000.00),
                new Employee("Bob", "HR", 40000.12),
                new Employee("Charlie", "IT", 70000.34),
                new Employee("Diana", "HR", 45000.94),
                new Employee("Eve", "Finance", 60000.56)
        );

        // Find max salary by department
        Map<String, Double> maxSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDeptName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                optEmp -> optEmp.map(Employee::getSalary).orElse(0.0)
                        )
                ));

        // Enrich each employee with the max salary for their department
        List<Employee> enrichedEmployees = employees.stream()
                .peek(emp -> emp.setMaxSalary(maxSalaryByDept.get(emp.getDeptName())))
                .collect(Collectors.toList());

        // Print the enriched employee list
        enrichedEmployees.forEach(System.out::println);
    }
}
