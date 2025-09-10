package com.pixel.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AveragePrice {
    private String symbol;
    private double averagePrice;
    private int count; // Optional: Number of trades considered
    private Instant timestamp; // Optional: Time of calculation
}