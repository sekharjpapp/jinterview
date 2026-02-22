package com.pixel.springdp.service;

import com.pixel.springdp.PaymentStrategy;
import com.pixel.springdp.PaymentType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class PaymentService {

    private final Map<String, PaymentStrategy> strategyMap;

    public PaymentService(Map<String, PaymentStrategy> strategyMap) {
        this.strategyMap = strategyMap;
    }

    public void process(PaymentType type, BigDecimal amount) {
        System.out.println(">>> Requested payment type: " + type);
        System.out.println(">>> Available strategies: " + strategyMap.keySet());
        PaymentStrategy strategy = strategyMap.get(type.name());

        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported payment type: " + type);
        }

        strategy.pay(amount);
    }
}

