package com.pixel.j8group;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalClient {
    public static void main(String[] args) {

        List<EmployeeSal> empList = List.of(
            new EmployeeSal(1, "John Doe", "Engineering", 75000),
            new EmployeeSal(2, "Jane Smith", "Marketing", 65000),
            new EmployeeSal(1,"Bob Brown", "Engineering", 80000),
            new EmployeeSal(3, "Emily Johnson", "Sales", 70000),
            new EmployeeSal(2,"Alice Davis", "Marketing", 72000));
        empList.stream()
                .collect(Collectors.toMap(
                        EmployeeSal::getId,
                        emp -> emp,
                        (emp1, emp2) -> emp1.getSalary() >= emp2.getSalary() ? emp1 : emp2
                )).entrySet().stream().collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue()
                )).values().forEach(System.out::println);
        System.out.println("--------------------------------");
        //TODO: top2ByDepartment
        Map<String, List<EmployeeSal>> top2ByDept = empList.stream()
                .collect(Collectors.groupingBy(EmployeeSal::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                                        .limit(2)
                                        .collect(Collectors.toList())
                        )));
        top2ByDept.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });
        System.out.println("****************************************");
        //TODO: Top 2 highest-paid employees in each department
        Map<String, List<EmployeeSal>> collect = empList.stream()
                .collect(Collectors.groupingBy(EmployeeSal::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                                        .limit(2)
                                        .collect(Collectors.toList())
                        )));
        collect.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });

    }
}
