package com.pixel.visa.emp;

import com.pixel.visa.emp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class EmpGroupByApp {

    private final EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(EmpGroupByApp.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void go() {
        System.out.println(employeeService.groupEmployeesBySalaryRange());
    }
}
