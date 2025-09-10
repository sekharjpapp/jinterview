package com.pixel.streamapi;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarModels {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("sedan", "BMW", "530", 2500),
                new Car("sedan", "Audi", "A5", 1600),
                new Car("sedan", "Mercedes", "E-Class", 1998),
                new Car("hatchback", "Skoda", "Octavia", 1998),
                new Car("hatchback", "Toyota", "TypeR", 1450)
        );
        Set<Car> sedanCars = cars.stream().filter(car -> car.type().equals("sedan")).collect(Collectors.toSet());
        //System.out.println(sedanCars);
        List<String> carsmakeList = cars.stream().map(car -> car.make()).toList();
        //System.out.println(carsmakeList);
        List<String> carsMakeItsModels = cars.stream().flatMap(car -> Stream.of(car.make(), car.model())).toList();
        //System.out.println(carsMakeItsModels);
        List<Car> sedan = cars.stream().collect(Collectors.partitioningBy(car -> car.type().equals("sedan"))).get(true);
        //System.out.println(sedan);
        Map<String, Map<String, String>> carMakeModels = cars.stream()
                .collect(Collectors.groupingBy(car -> car.type(), Collectors.toMap(car -> car.make(), car -> car.model())));
        System.out.println(carMakeModels);
    }
}
