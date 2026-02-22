package com.pixel.designpatterns.decoratorfactory;

public class BasicMarioImpl implements Mario {

    @Override
    public String getDescription() {
        return "Basic Mario";
    }

    @Override
    public int getPower() {
        return 10;
    }
}
