package com.pixel.inheritance;

import lombok.Getter;
import lombok.Setter;

// Base class
@Getter
@Setter
public class Vehicle {
    private final double acceleration;
    private double speed = 0.0;

    public Vehicle(double acceleration) {
        this.acceleration = acceleration;
    }

    public void accelerate() {
        speed += acceleration;
    }

    public void makeEngineSound() {
        System.out.println("Vrrrrrr ... ");
    }
}


