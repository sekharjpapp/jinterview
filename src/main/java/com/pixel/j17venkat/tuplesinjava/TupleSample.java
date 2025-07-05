package com.pixel.j17venkat.tuplesinjava;

import java.util.List;

public class TupleSample {
    public static int getPrices(String ticker) {
        return (int) (Math.random() * 1000);
    }
    public static void main(String[] args) {
        List<String> tickers = List.of("AAPL", "GOOGL", "AMZN");
        tickers.stream()
                .map(ticker -> new Stock(ticker, getPrices(ticker)))
                .forEach(System.out::println);
    }
}
record Stock(String ticker, int price) {

    @Override
    public String toString() {
        return "Ticker %s, Price: $%d".formatted(ticker,price);
    }
}
