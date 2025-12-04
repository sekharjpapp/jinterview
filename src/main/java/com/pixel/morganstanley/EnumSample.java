package com.pixel.morganstanley;

public class EnumSample {
    enum Animals{
        LION,DOG,COW;
    }

    public static void main(String[] args) {
        Animals[] animals = Animals.values();
        System.out.println(animals[1]);

    }
}
