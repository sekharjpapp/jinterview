package com.pixel.interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GreaterSalOfEmp {
    public static void main(String[] args) {
        var employeeList = List.of(
                new Employee("Bob",     "IT",      90000),
                new Employee("Alice",   "HR",      75000),
                new Employee("Charlie", "Finance", 85000),
                new Employee("Diana",   "IT",      95000),
                new Employee("Ethan",   "Sales",   70000)
        );
        // find the Employees earning above their department's avg salary
        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        Collectors.averagingDouble(Employee::salary)));
        // 2) employees earning above their department's average
        List<Employee> aboveAvg = employeeList.stream()
                .filter(e -> e.salary() > avgSalary.get(e.department()))
                .toList();
        aboveAvg.forEach(System.out::println);
    }
}
record Employee(String name, String department,Integer salary) {
}
