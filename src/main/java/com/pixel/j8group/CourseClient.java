package com.pixel.j8group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseClient {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
                new Course("Math", Arrays.asList("Alice", "Bob")),
                new Course("Science", Arrays.asList("Charlie", "David")),
                new Course("Math", Arrays.asList("Eve", "Frank"))
        );

        Map<String, List<String>> studentsGroupedByCourse = courses.stream()
                .collect(Collectors.groupingBy(Course::getName,
                        Collectors.flatMapping(course -> course.getStudents().stream(), Collectors.toList())));
        System.out.println(studentsGroupedByCourse);
    }
}
