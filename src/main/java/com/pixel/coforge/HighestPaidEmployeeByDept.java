package com.pixel.coforge;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployeeByDept {
    public static void main(String[] args) {
        List<EmployeeDept> employees = Arrays.asList(
                new EmployeeDept(1, "Alice", "IT", 90000),
                new EmployeeDept(2, "Bob", "HR", 75000),
                new EmployeeDept(3, "Charlie", "IT", 95000),
                new EmployeeDept(4, "David", "Finance", 80000),
                new EmployeeDept(5, "Eve", "HR", 80000),
                new EmployeeDept(6, "Frank", "Finance", 85000)
        );

        // Find highest-paid employees department-wise
        String stringStream = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDept::getDept,
                        Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(EmployeeDept::getSalary)),
                        Optional::orElseThrow
                ))).entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
        System.out.println(stringStream);
        // Print the results
       /* highestPaidByDept.forEach((dept, empOpt) ->
                System.out.println("Department: " + dept + ", Highest Paid: " + empOpt.get().getName()));*/
    }
}
