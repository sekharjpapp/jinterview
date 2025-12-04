package com.pixel.mongodb;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Employee {
    private String email;
    private String subject;
    private int marks;
    private int totalMarks;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("sunil@gmail.com", "JAVA", 60, 100));
        employees.add(new Employee("Sunil@gmail.com", "SQL", 70, 100));
        employees.add(new Employee("sunil@gmail.com", "SPRING", 80, 100));

        employees.add(new Employee("abc@gmail.com", "JAVA", 60, 100));
        employees.add(new Employee("aBc@gmail.com", "SQL", 70, 100));
        employees.add(new Employee("abc@gmail.com", "SPRING", 70, 100));

        // Q1: Give the employee count (unique employees by email)
        long employeeCount = employees.stream()
                .map(emp -> emp.getEmail().toLowerCase())
                .distinct()
                .count();

        System.out.println("Employee Count: " + employeeCount);

        // Q2: Get the employee's percentage
        Map<String, Double> employeePercentages = calculateEmployeePercentages(employees);

        System.out.println("\nEmployee Percentages:");
        employeePercentages.forEach((email, percentage) ->
                System.out.printf("%s: %.2f%%\n", email, percentage));
    }

    private static Map<String, Double> calculateEmployeePercentages(List<Employee> employees) {
        // Group by lowercase email and calculate average percentage
        return employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getEmail().toLowerCase(),
                        Collectors.averagingDouble(emp -> (emp.getMarks() * 100.0) / emp.getTotalMarks())
                ));
    }
    }

