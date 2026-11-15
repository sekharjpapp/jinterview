package com.pixel.springsingleton;

import com.pixel.springsingleton.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class SingletonSB {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SingletonSB.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void eventListener(ApplicationReadyEvent event) {
        log.info("Application is ready");
        log.info("Spring Boot Application Started");

        // ============ 5 PLAIN JAVA USER OBJECTS WITH FOR LOOP ============
        log.info("=== 5 PLAIN JAVA USER OBJECTS (Created with for loop) ===");

        for (int i = 0; i < 5; i++) {
            User user = new User(i + 1, "User" + (i + 1));
            log.info("Created: {}", user);
        }
    }
}
