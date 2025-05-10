package com.pixel.optum;

import java.util.*;
import java.util.stream.Collectors;

public class EmpProcessingProblem {
    public static void main(String[] args) {
        List<EmployeeOptum> employees = Arrays.asList(
                new EmployeeOptum(1, "Ram", 100000, "IT"),
                new EmployeeOptum(2, "Ravi", 20000, "Sales"),
                new EmployeeOptum(3, "Rahul", 500000, "IT"),
                new EmployeeOptum(4, "Rana", 450000, "Marketing"),
                new EmployeeOptum(5, "Ranga", 30000, "Sales")
        );
        // Group Employees by department and print them using Java 8 streams
        System.out.println("\nEmployees by department:");
        employees.stream()
                .collect(Collectors.groupingBy(EmployeeOptum::getDepartment))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("\nEmployees whose salary greater than 40000:");
        //TODO - Print employee name whose salary is greater than 40000 using java8 streams
        employees.stream()
                .filter(e -> e.getSal() > 40000)
                .map(EmployeeOptum::getName)
                .forEach(System.out::println);
        System.out.println("\nEmployees sorted by their name in descending order:");
        //TODO - Sort employees list by their name in descending order and print their names
        employees.stream()
                .sorted(Comparator.comparing(EmployeeOptum::getName).reversed())
                .map(EmployeeOptum::getName)
                .forEach(System.out::println);
        // TODO - find department wise counting
        System.out.println("------find department wise counting ------" );
        Map<String, Long> departmentCount  = employees.stream()
                .collect(Collectors.groupingBy(EmployeeOptum::getDepartment, Collectors.counting()));
        departmentCount.forEach((dep,count)-> System.out.println(dep + " " + count));
        //  TODO - find the department name that has the highest number of employees.
        Optional<Map.Entry<String, Long>> max = employees.stream()
                .collect(Collectors.groupingBy(EmployeeOptum::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max);
    }
}
