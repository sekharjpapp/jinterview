package com.pixel.dsa.singleton;

import org.springframework.stereotype.Component;

@Component
public class SpringSingleton {

    public SpringSingleton() {
        System.out.println("Spring Bean Created");
    }
}
