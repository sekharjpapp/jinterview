package com.pixel.sealedclasses;

final class BrokenLight implements TrafficLight {
}
public class SampleSealed {
    public static void main(String[] args) {
        TrafficLight light = new RedLight();
        System.out.println(light);
    }
}
