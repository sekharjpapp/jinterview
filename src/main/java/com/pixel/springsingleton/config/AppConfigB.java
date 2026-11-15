package com.pixel.springsingleton.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AppConfigB {

    public AppConfigB() {
        log.info("AppConfigB initialized");
    }
}
