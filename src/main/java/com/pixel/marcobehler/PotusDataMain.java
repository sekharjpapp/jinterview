package com.pixel.marcobehler;

public class PotusDataMain {
    public static void main(String[] args) {
        PotusData data = new PotusData();

        // Print all POTUS data
        data.getPotuses().forEach(System.out::println);
    }
}
