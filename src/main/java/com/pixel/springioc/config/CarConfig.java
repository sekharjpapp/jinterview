package com.pixel.springioc.config;

import com.pixel.springioc.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarConfig {

    @Bean
    @Scope("singleton") // change to "prototype" if you want a new instance each time)
    public Car car() {
        // default values (will be overridden later if needed)
        return new Car("Default", "Black", 100);
    }
}

