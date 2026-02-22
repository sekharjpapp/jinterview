package com.pixel.designpatterns.decoratorfactory;

public abstract class MarioDecorator implements Mario {

    protected final Mario mario;

    protected MarioDecorator(Mario mario) {
        this.mario = mario;
    }

    @Override
    public String getDescription() {
        return mario.getDescription();
    }

    @Override
    public int getPower() {
        return mario.getPower();
    }
}

