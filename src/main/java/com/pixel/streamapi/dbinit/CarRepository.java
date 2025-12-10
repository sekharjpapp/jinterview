package com.pixel.streamapi.dbinit;

import com.pixel.streamapi.Car;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarRepository {
    public static List<Car> getAllCars() {
         return List.of(
                new Car("sedan", "BMW", "530", 2500),
                new Car("sedan", "Audi", "A5", 1600),
                new Car("sedan", "Mercedes", "E-Class", 1998),
                new Car("hatchback", "Skoda", "Octavia", 1998),
                new Car("hatchback", "Toyota", "TypeR", 1450)
        );
    }
    public static Set<Car> getSedanCars() {
      return  getAllCars().stream()
                .filter(car -> car.type().equals("sedan"))
                .collect(Collectors.toSet());
    }
    public static List<String> getCarMakes() {
        return getAllCars()
        .stream().map(car -> car.make()).toList();
    }
    public static List<String> getCarMakesAndModelsFlat() {
        return getAllCars().stream()
                .flatMap(car -> Stream.of(car.make(), car.model()))
                .toList();
    }
    public static List<Car> getSedanCarsPartitioned() {
        return getAllCars().stream()
                .collect(Collectors.partitioningBy(car -> car.type().equals("sedan"))).get(true);
    }
    public static Map<String, Map<String, String>> getCarMakeModelMap() {
        return getAllCars().stream()
            .collect(Collectors.groupingBy(car -> car.type(), Collectors.toMap(car -> car.make(), car -> car.model())));
    }
}
