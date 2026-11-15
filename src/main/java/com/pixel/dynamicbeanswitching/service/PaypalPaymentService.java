package com.pixel.dynamicbeanswitching.service;

import com.pixel.dynamicbeanswitching.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaypalPaymentService implements PaymentService {
    @Override
    public String pay(String amount,String mode,String sender,String receiver) {
        log.info("Processing payment with PayPal: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
        return "paid with paypal " + amount + " from " + sender + " to " + receiver;
    }
}
