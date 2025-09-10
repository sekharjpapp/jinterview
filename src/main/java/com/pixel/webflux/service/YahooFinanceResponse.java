package com.pixel.webflux.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class YahooFinanceResponse {
    private Chart chart;

    @Data
    public static class Chart {
        private List<Result> result;
        private String error;
    }

    @Data
    public static class Result {
        private Meta meta;
        private List<Long> timestamp;
        private Indicators indicators;
    }

    @Data
    public static class Meta {
        private String symbol;
        private double regularMarketPrice;
        private long regularMarketTime;
    }

    @Data
    public static class Indicators {
        private List<Quote> quote;
    }

    @Data
    public static class Quote {
        private List<Double> open;
        private List<Double> high;
        private List<Double> low;
        private List<Double> close;
        private List<Long> volume;
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Trade {
        private String symbol;
        private double price;
        private long volume;
        private Instant timestamp;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AveragePrice {
        private String symbol;
        private double averagePrice;
        private long totalVolume;
        private Instant windowEnd;
    }
}




