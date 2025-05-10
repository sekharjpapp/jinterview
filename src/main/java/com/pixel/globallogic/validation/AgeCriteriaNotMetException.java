package com.pixel.globallogic.validation;

public class AgeCriteriaNotMetException extends StudentValidationException {
    public AgeCriteriaNotMetException(String message) {
        super(message);
    }
}