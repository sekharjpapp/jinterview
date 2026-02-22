package com.pixel.designpatterns.decoratorfactory;

public class StarPower extends MarioDecorator {

    public StarPower(Mario mario) {
        super(mario);
    }

    @Override
    public String getDescription() {
        return mario.getDescription() + " + Star";
    }

    @Override
    public int getPower() {
        return mario.getPower() + 50;
    }
}
