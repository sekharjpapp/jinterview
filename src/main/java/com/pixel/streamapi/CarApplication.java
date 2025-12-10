package com.pixel.streamapi;

import com.pixel.streamapi.dbinit.CarRepository;

import java.util.List;
import java.util.Map;

public class CarApplication {
    public static void main(String[] args) {
        // get all sedan cars
        List<Car> sedans = CarRepository.getAllCars();
        System.out.println("Sedans = " + sedans);

        // get all car makes
        List<String> makes = CarRepository.getCarMakes();
        System.out.println("Makes = " + makes);

        // get makes + models flat
        List<String> flat = CarRepository.getCarMakesAndModelsFlat();
        System.out.println("Flat list = " + flat);

        // partition sedans + non sedans
        List<Car> sedansPartitioned = CarRepository.getSedanCarsPartitioned();
        System.out.println("Sedans (partition) = " + sedansPartitioned);

        // group by type, map = type → {make → model}
        Map<String, Map<String, String>> grouped = CarRepository.getCarMakeModelMap();
        System.out.println("Grouped = " + grouped);    }
}
