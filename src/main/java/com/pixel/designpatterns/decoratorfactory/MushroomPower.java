package com.pixel.designpatterns.decoratorfactory;

public class MushroomPower extends MarioDecorator {

    public MushroomPower(Mario mario) {
        super(mario);
    }

    @Override
    public String getDescription() {
        return mario.getDescription() + " + Mushroom";
    }

    @Override
    public int getPower() {
        return mario.getPower() + 20;
    }
}

