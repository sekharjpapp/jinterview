package com.pixel.inheritance.composition;

public class CompositionMain {
    public static void main(String[] args) {
        // Create a basic Vehicle and wrap it in a RaceCar
        Vehicle baseVehicle = new Vehicle(2.0);
        RaceCar raceCar = new RaceCar(baseVehicle);
        drive(raceCar);

        // Demonstrate flexibility - can swap implementations!
        System.out.println("\n--- Swapping to Electric Vehicle ---");
        IVehicle electricVehicle = new ElectricVehicle(3.0);
        RaceCar electricRaceCar = new RaceCar(electricVehicle);
        drive(electricRaceCar);
    }

    private static void drive(IVehicle vehicle) {
        vehicle.makeEngineSound();
        vehicle.accelerate();
        vehicle.accelerate();
        System.out.println("Speed: " + vehicle.getSpeed());
    }
}
