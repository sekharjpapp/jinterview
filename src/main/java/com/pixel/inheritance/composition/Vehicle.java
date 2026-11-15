package com.pixel.inheritance.composition;

import lombok.Getter;

@Getter
public class Vehicle implements IVehicle {
    private final double acceleration;
    private double speed = 0.0;

    public Vehicle(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public void accelerate() {
        speed += acceleration;
    }

    @Override
    public void makeEngineSound() {
        System.out.println("Vrrrrrr ... ");
    }
}
