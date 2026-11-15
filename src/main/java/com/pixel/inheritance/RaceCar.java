package com.pixel.inheritance;

public class RaceCar extends Vehicle {
    public RaceCar(double acceleration) {
        super(acceleration);
    }

    @Override
    public void makeEngineSound() {
        System.out.println("Vroom! Vroom!");
    }
}
