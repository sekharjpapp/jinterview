package com.pixel.collectionssample;

import java.util.Arrays;
import java.util.List;

public class StudentClient {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student(101, "tom"),
                new Student(109, "john"),
                new Student(105, "bob")
                );

        System.out.println(studentList);
    }
}
