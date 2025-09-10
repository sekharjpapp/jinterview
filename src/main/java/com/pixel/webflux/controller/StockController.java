package com.pixel.webflux.controller;

import com.pixel.webflux.service.StockService;
import com.pixel.webflux.service.YahooFinanceResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping(value = "/{symbol}/trades", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<YahooFinanceResponse.Trade> getTrades(@PathVariable String symbol) {
        return stockService.getLiveTrades(symbol)
                .take(10) // Limit to 10 items for browser testing
                .delayElements(Duration.ofSeconds(1)); // Slow down for visibility
    }

    @GetMapping(value =  "/{symbol}/average", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<YahooFinanceResponse.AveragePrice> getRollingAverage(
            @PathVariable String symbol,
            @RequestParam(defaultValue = "5") int windowSize
    ) {
        return stockService.getLiveTrades(symbol)
                .transform(trades -> stockService.calculateRollingAverage(trades, windowSize));
    }
}
