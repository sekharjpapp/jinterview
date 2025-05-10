package com.pixel.coforge.plbm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountRange {

    int lowerBound;
    int upperBound;
    int discountRate;
}
