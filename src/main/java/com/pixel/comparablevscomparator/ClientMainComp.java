package com.pixel.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClientMainComp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101, "John");
        Student s2 = new Student(105, "Alice");
        Student s3 = new Student(103, "Bob");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println("Before sorting: " + students);
        Collections.sort(students);
        System.out.println("After sorting: " + students);
        // use java 8 lambda expression to sort by name
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("After sorting by name: " + students);
        // java 8 sort by id in descending order
        students.sort(Comparator.comparing(Student::getId).reversed());
        System.out.println("After sorting by id in descending order: " + students);
        List<Student> studentList = students.stream().sorted(Comparator.comparing(Student::getId)).toList();
        System.out.println("After sorting by id using streams: " + studentList);
        // java 8 sort by name then by id
        List<Student> studentList2 = students.stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getId))
                .toList();
        System.out.println("After sorting by name then by id: " + studentList2);
    }
}
