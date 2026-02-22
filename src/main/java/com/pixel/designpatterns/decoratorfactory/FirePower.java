package com.pixel.designpatterns.decoratorfactory;

public class FirePower extends MarioDecorator {

    public FirePower(Mario mario) {
        super(mario);
    }

    @Override
    public String getDescription() {
        return mario.getDescription() + " + Fire";
    }

    @Override
    public int getPower() {
        return mario.getPower() + 30;
    }
}

