package com.pixel.springcore;

import com.pixel.springcore.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class QualifiervsPrimary {

    @Autowired
    @Qualifier("fourWheeler")
    private Vehicle vehicle;

    public static void main(String[] args) {
        SpringApplication.run(QualifiervsPrimary.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void go() {
        System.out.println(vehicle.noOfWheels());
    }
}
