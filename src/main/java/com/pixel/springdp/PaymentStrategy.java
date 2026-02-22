package com.pixel.springdp;

import java.math.BigDecimal;

public interface PaymentStrategy {
    PaymentType getType();
    void pay(BigDecimal amount);
}
