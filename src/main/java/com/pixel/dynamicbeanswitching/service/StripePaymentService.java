package com.pixel.dynamicbeanswitching.service;

import com.pixel.dynamicbeanswitching.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StripePaymentService implements PaymentService {


    @Override
    public String pay(String amount, String mode, String sender, String receiver) {
        log.info("Processing payment with Stripe: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
        return "Paid with Stripe " + amount + " from " + sender + " to " + receiver;
    }
}
