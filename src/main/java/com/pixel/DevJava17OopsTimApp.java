package com.pixel;

import com.pixel.nessdigital.singletonproto.ReportService;
import com.pixel.webflux.controller.TradeController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class DevJava17OopsTimApp {

	@Autowired
	private ReportService reportService;

    @Autowired
    private final TradeController tradeController;

	public static void main(String[] args) {
		SpringApplication.run(DevJava17OopsTimApp.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onApplicationReady() {
		System.out.println("Application ready");
		assignmentOperator();
		isCarFalse();
		reportService.generateCustomReport("Report for User1");
		reportService.generateCustomReport("Report for User2");
	}


	public static int assignmentOperator() {
		int newValue = 50;
		if (newValue == 50) {
			System.out.println(	"This is error");
		}
		return newValue;
	}
	public static boolean isCarFalse() {
		boolean isCar = false;
		if ( !isCar) {
			System.out.println("This is error");
		}
		return isCar;
	}
}
