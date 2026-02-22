package com.pixel.springdp;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class UpiPaymentStrategy implements PaymentStrategy {

    @Override
    public PaymentType getType() {
        return PaymentType.UPI;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing UPI payment: " + amount);
    }
}

