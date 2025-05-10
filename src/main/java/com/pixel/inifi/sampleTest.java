package com.pixel.inifi;

import java.util.*;
import java.util.stream.Collectors;

public class sampleTest {
    public static void main(String[] args) {
        List<EmployeeInfi> employees = Arrays.asList(
                new EmployeeInfi("John Doe", 29, "Engineering", 75000),
                new EmployeeInfi("Jane Smith", 35, "Marketing", 95000),
                new EmployeeInfi("Alice Johnson", 28, "Engineering", 95000),
                new EmployeeInfi("Bob Brown", 45, "HR", 60000),
                new EmployeeInfi("Bob ", 42, "HR", 50000),
                new EmployeeInfi("Charlie Davis", 38, "Marketing", 95000),
                new EmployeeInfi("Eve White", 42, "Finance", 105000),
                new EmployeeInfi("Grace Green", 31, "Engineering", 72000)
        );
        //

        List<Map.Entry<String, Map<Integer, List<EmployeeInfi>>>> groupBySalary = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeInfi::getDepartment, Collectors.groupingBy(EmployeeInfi::getAge)
                ))
                .entrySet()
                .stream()
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(groupBySalary);
        //groupBySalary.forEach((k,v)-> System.out.println(k + " : " +v));

        Optional<Integer> first = employees.stream()
                .map(EmployeeInfi::getAge)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        //System.out.println(first);

    }
}
