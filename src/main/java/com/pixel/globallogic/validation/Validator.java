package com.pixel.globallogic.validation;

public interface Validator {
    boolean validate(Student s) throws StudentValidationException, AgeCriteriaNotMetException;
}
