package com.pixel.j8group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeClient {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("HR", 50000),
                new Employee("Engineering", 80000),
                new Employee("HR", 55000),
                new Employee("Engineering", 75000)
        );
        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(collect);
        Map<String, Integer> departmentSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));
        System.out.println(departmentSalary);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        Map<String, List<Integer>> groupedByParity = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

        System.out.println(groupedByParity);
    }
}
