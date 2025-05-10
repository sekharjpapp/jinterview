package com.pixel.dilipj8.streamapi;

import com.pixel.dilipj8.data.Student;
import com.pixel.dilipj8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleClient {
    public static void main(String[] args) {

        Map<String, List<String>> studentActivities = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentActivities);
    }
}
