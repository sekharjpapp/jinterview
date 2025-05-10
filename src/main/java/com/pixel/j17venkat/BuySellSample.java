package com.pixel.j17venkat;

public class BuySellSample {
    /*public static String process(Trade trade) {
      *//*  return switch (trade) {
            //case Sell sell -> "Selling " +sell.quantity() + " of " + sell.ticker();
            //case Buy buy -> "Selling " +buy.quantity() + " of " + buy.ticker();
            //default -> "Invalid Tranaction ";
        };*//*
    }*/
    public static void main(String[] args) {

    }
    sealed interface Trade{}
    record Sell(String ticker, int quantity) implements Trade {}
    record Buy(String ticker, int quantity) implements Trade {}
}
