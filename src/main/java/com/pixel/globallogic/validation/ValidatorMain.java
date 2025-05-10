package com.pixel.globallogic.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidatorMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 6));    // Valid
        students.add(new Student(null, 7));       // Invalid name
        students.add(new Student("Bob", 3));      // Age < 5
        students.add(new Student("Charlie", -2)); // Invalid age

        Validator validator = new StudentValidatorImpl();

        for (Student student : students) {
            try {
                validator.validate(student);
                System.out.println(student.getName() + ": Validation passed");
            } catch (AgeCriteriaNotMetException e) {
                System.out.println(student.getName() + " error: " + e.getMessage());
            } catch (StudentValidationException e) {
                System.out.println(student.getName() + " error: " + e.getMessage());
            }
        }
    }
}
