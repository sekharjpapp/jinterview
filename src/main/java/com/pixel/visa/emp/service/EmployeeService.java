package com.pixel.visa.emp.service;

import com.pixel.visa.emp.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    // Initialize employees when the Spring context loads
    @PostConstruct
    public void init() {
        employees = Arrays.asList(
                new Employee(1, "Alice", 8500, 25),
                new Employee(2, "Bob", 15000, 30),
                new Employee(3, "Charlie", 22000, 28),
                new Employee(4, "David", 18000, 35),
                new Employee(5, "Eve", 32000, 29),
                new Employee(6, "Frank", 9800, 26)
        );
    }

    public Map<String, List<Employee>> groupEmployeesBySalaryRange() {
        return employees.stream()
                .filter(emp -> emp.getSalary() <= 20000)
                .collect(Collectors.groupingBy(emp -> getSalaryRange(emp.getSalary())));
    }

    private String getSalaryRange(double salary) {
        // Salary ranges in 10,000 increments
        int lowerBound = ((int) salary / 10000) * 10000 + 1;
        int upperBound = lowerBound + 9999;
        return "₹" + lowerBound + " - ₹" + upperBound;
    }
}

