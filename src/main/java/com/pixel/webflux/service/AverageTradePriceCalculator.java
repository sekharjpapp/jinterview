package com.pixel.webflux.service;

import com.pixel.webflux.model.AveragePrice;
import com.pixel.webflux.model.Trade;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AverageTradePriceCalculator {

    // Store intermediate state per symbol
    private final Map<String, Accumulator> accumulatorMap = new HashMap<>();

    public Flux<AveragePrice> calculateAverages(Flux<Trade> trades) {
        return trades
                .groupBy(Trade::getSymbol) // Group trades by symbol
                .flatMap(groupedFlux ->
                        groupedFlux
                                .window(Duration.ofSeconds(5)) // Sliding window of 5 seconds
                                .flatMap(window ->
                                        window
                                                .collectList()
                                                .map(tradeList -> calculateAverage(tradeList))
                                                .log())); // For debugging
    }

    private AveragePrice calculateAverage(List<Trade> trades) {
        if (trades.isEmpty()) {
            return null;
        }

        String symbol = trades.get(0).getSymbol();
        double totalPrice = 0.0;
        int totalQuantity = 0;

        for (Trade trade : trades) {
            totalPrice += trade.getPrice() * trade.getQuantity();
            totalQuantity += trade.getQuantity();
        }

        double averagePrice = totalPrice / totalQuantity;

        return new AveragePrice(
                symbol,
                averagePrice,
                trades.size(),
                Instant.now()
        );
    }

    // Alternative: Stateful version with accumulator
    public Flux<AveragePrice> calculateAveragesStateful(Flux<Trade> trades) {
        return trades
                .doOnNext(trade -> {
                    Accumulator acc = accumulatorMap.computeIfAbsent(
                            trade.getSymbol(),
                            k -> new Accumulator()
                    );
                    acc.addTrade(trade.getPrice(), trade.getQuantity());
                })
                .map(trade -> {
                    Accumulator acc = accumulatorMap.get(trade.getSymbol());
                    return new AveragePrice(
                            trade.getSymbol(),
                            acc.getAveragePrice(),
                            acc.getCount(),
                            Instant.now()
                    );
                });
    }

    // Helper class for stateful calculation
    private static class Accumulator {
        private double totalPrice = 0.0;
        private int totalQuantity = 0;
        private int count = 0;

        public void addTrade(double price, int quantity) {
            this.totalPrice += price * quantity;
            this.totalQuantity += quantity;
            this.count++;
        }

        public double getAveragePrice() {
            return (totalQuantity == 0) ? 0.0 : totalPrice / totalQuantity;
        }

        public int getCount() {
            return count;
        }
    }
}
