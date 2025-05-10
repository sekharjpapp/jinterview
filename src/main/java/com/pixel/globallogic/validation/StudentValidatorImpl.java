package com.pixel.globallogic.validation;

public class StudentValidatorImpl implements Validator {
    @Override
    public boolean validate(Student student) {
        // Check for basic validity
        if (student.getName() == null || student.getAge() < 0) {
            throw new StudentValidationException("Student name and age must be valid");
        }

        // Check age criteria
        if (student.getAge() < 5) {
            throw new AgeCriteriaNotMetException("Student age must be at least 5 years");
        }

        return true;
    }
}
