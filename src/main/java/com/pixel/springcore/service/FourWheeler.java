package com.pixel.springcore.service;

import com.pixel.springcore.model.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class FourWheeler implements Vehicle {
    @Override
    public int noOfWheels() {
        return 4;
    }
}
