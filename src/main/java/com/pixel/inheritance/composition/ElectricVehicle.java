package com.pixel.inheritance.composition;

import lombok.Getter;

@Getter
public class ElectricVehicle implements IVehicle {
    private final double acceleration;
    private double speed = 0.0;

    public ElectricVehicle(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void accelerate() {
        speed += acceleration * 1.5; // Electric cars accelerate faster
    }

    @Override
    public void makeEngineSound() {
        System.out.println("Whirrrrrr ... ");
    }
}
