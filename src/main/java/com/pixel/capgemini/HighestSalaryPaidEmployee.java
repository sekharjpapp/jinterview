package com.pixel.capgemini;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestSalaryPaidEmployee {

    public static void main(String[] args) {
        List<Emp> empList = Stream.of(
                new Emp(1, "Sachin", "IT", 1000),
                new Emp(2, "Tom", "HR", 2000),
                new Emp(3, "Jim", "Dev", 3000),
                new Emp(4, "Pam", "Dev", 4000),
                new Emp(5, "Alex", "Dev", 5000)
        ).toList();

        Comparator<Emp> comparing = Comparator.comparing(Emp::getSalary);

        Map<String, Optional<Emp>> highestPaidEmployees = empList.stream()
                .collect(Collectors.groupingBy(
                        Emp::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(comparing))
                ));

        // To print the highest-paid employees by department
        highestPaidEmployees.forEach((department, emp) ->
                System.out.println(department + " -> " + emp.orElse(null)));

    }
    public static void getHihestSalaryPaidEmployee(List<com.pixel.capgemini.Emp> emps) {

    }

}
