package com.pixel.webflux.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.Instant;

@Service
public class StockService {
    private final WebClient webClient;

    public StockService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://query1.finance.yahoo.com").build();
    }

    // Fetch real-time trades for a symbol
    public Flux<YahooFinanceResponse.Trade> getLiveTrades(String symbol) {
        return Flux.interval(Duration.ofSeconds(5)) // Poll every 5 seconds
                .flatMap(i -> fetchYahooFinanceData(symbol))
                .map(response -> {
                    YahooFinanceResponse.Meta meta = response.getChart().getResult().get(0).getMeta();
                    return new YahooFinanceResponse.Trade(
                            meta.getSymbol(),
                            meta.getRegularMarketPrice(),
                            0, // Yahoo doesn't provide per-trade volume in this endpoint
                            Instant.ofEpochSecond(meta.getRegularMarketTime())
                    );
                })
                .log("Yahoo Finance Trade");
    }

    private Mono<YahooFinanceResponse> fetchYahooFinanceData(String symbol) {
        return webClient.get()
                .uri("/v8/finance/chart/{symbol}?interval=1m&range=1d", symbol)
                .retrieve()
                .bodyToMono(YahooFinanceResponse.class);
    }

    // Calculate rolling average (5-element window)
    public Flux<YahooFinanceResponse.AveragePrice> calculateRollingAverage(Flux<YahooFinanceResponse.Trade> trades, int windowSize) {
        return trades
                .window(windowSize) // Group into sliding windows
                .flatMap(window -> window
                        .collectList()
                        .map(tradeList -> {
                            double sum = tradeList.stream().mapToDouble(YahooFinanceResponse.Trade::getPrice).sum();
                            long totalVolume = tradeList.stream().mapToLong(YahooFinanceResponse.Trade::getVolume).sum();
                            return new YahooFinanceResponse.AveragePrice(
                                    tradeList.get(0).getSymbol(),
                                    sum / tradeList.size(),
                                    totalVolume,
                                    Instant.now()
                            );
                        })
                );
    }
}