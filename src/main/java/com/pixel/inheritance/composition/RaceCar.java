package com.pixel.inheritance.composition;

import lombok.Getter;

@Getter
public class RaceCar implements IVehicle {
    private final IVehicle vehicle;

    public RaceCar(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public double getSpeed() {
        return vehicle.getSpeed();
    }

    @Override
    public void accelerate() {
        vehicle.accelerate();
    }

    @Override
    public void makeEngineSound() {
        System.out.println("Vroom! Vroom!");
    }
}
