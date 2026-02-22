package com.pixel.springdp;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public PaymentType getType() {
        return PaymentType.CARD;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing CARD payment: " + amount);
    }
}

