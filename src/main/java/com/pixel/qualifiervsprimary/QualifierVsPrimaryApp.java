package com.pixel.qualifiervsprimary;

import com.pixel.qualifiervsprimary.service.SocialisedService;
import com.pixel.qualifiervsprimary.service.SocialisedServiceYT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class QualifierVsPrimaryApp {

    @Autowired
    private SocialisedService socialisedService;

    @Autowired
    private SocialisedServiceYT  socialisedServiceYT;

    public static void main(String[] args) {
        SpringApplication.run(QualifierVsPrimaryApp.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        System.out.println("Application ready");
        socialisedService.postContent();

        socialisedServiceYT.postContent();
    }
}
