package com.pixel.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringIocSample {
    public static void main(String[] args) {
       ConfigurableApplicationContext context=  SpringApplication.run(SpringIocSample.class, args);

        List<Car> cars = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car("Model-" + i, "Red", 100 + i * 10));
            int carsHash = cars.hashCode();
            System.out.println(carsHash);
        }
        cars.forEach(System.out::println);

        System.out.println("****************************");
        for (int i = 1; i <= 5; i++) {
            context.getBean(Car.class);
            Car car;
            // create new Car using record immutability
            car = new Car("Model-" + i,"Red",100 + (i * 10));
            cars.add(car);
            int hash = car.hashCode();
            System.out.println(hash);
        }

        cars.forEach(System.out::println);
    }
}
