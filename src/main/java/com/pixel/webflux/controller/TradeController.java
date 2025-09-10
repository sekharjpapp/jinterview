package com.pixel.webflux.controller;

import com.pixel.webflux.model.AveragePrice;
import com.pixel.webflux.model.Trade;
import com.pixel.webflux.service.AverageTradePriceCalculator;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/api/trades")
public class TradeController {

    private final AverageTradePriceCalculator calculator;

    public TradeController(AverageTradePriceCalculator calculator) {
        this.calculator = calculator;
    }

    @PostMapping("/stream")
    public Flux<AveragePrice> streamAverages(@RequestBody Flux<Trade> trades) {
        return calculator.calculateAverages(trades);
    }

    // Alternative endpoint with simulated data
    @GetMapping("/mock-stream")
    public Flux<AveragePrice> mockStream() {
        Flux<Trade> mockTrades = Flux.interval(Duration.ofMillis(500))
                .map(i -> new Trade(
                        "STOCK-" + (i % 3 + 1), // Rotate between 3 symbols
                        100.0 + (Math.random() * 10), // Random price
                        1 + (int)(Math.random() * 10) // Random quantity
                ));

        return calculator.calculateAverages(mockTrades);
    }
}
