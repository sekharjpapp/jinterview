package com.pixel.j8group;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Print3rdHighestSalary {
    public static void main(String[] args) {
        List<EmployeeSalary> employees = List.of(
                new EmployeeSalary(1, "John", "Java", "Bank", 90000),
                new EmployeeSalary(2, "Mike", "Java", "Bank", 80000),
                new EmployeeSalary(3, "David", "Java", "Bank", 70000),
                new EmployeeSalary(4, "Smith", "Java", "Bank", 60000),

                new EmployeeSalary(5, "James", "React", "Bank", 85000),
                new EmployeeSalary(6, "Tom", "React", "Bank", 75000),

                new EmployeeSalary(7, "Alex", "DevOps", "Bank", 95000), // only one record

                new EmployeeSalary(8, "Bob", "Java", "Wipro", 100000),
                new EmployeeSalary(9, "Chris", "Java", "Wipro", 95000),
                new EmployeeSalary(10, "Mark", "Java", "Wipro", 90000)
        );
        employees.stream()
                .filter(emp -> "Bank".equals(emp.company()))
                .collect(Collectors.groupingBy(EmployeeSalary::domain))
                .forEach((domain, list) -> {

                    List<Double> salaries = list.stream()
                            .map(EmployeeSalary::salary)
                            .distinct()
                            .sorted(Comparator.reverseOrder())
                            .toList();

                    Double salary = salaries.size() >= 3
                            ? salaries.get(2)
                            : salaries.get(salaries.size() - 1);

                    System.out.println(domain + " -> " + salary);
                });
    }
}
record EmployeeSalary(int id, String name, String domain, String company, double salary) { }
