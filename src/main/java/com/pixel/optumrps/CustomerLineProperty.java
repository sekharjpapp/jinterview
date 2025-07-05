package com.pixel.optumrps;

public class CustomerLineProperty {
    double billedAmount;
    double linePaidAmount;

    CustomerLineProperty(double billedAmount, double linePaidAmount) {
        this.billedAmount = billedAmount;
        this.linePaidAmount = linePaidAmount;
    }
    @Override
    public String toString() {
        return "billedAmount=" + billedAmount + ", linePaidAmount=" + linePaidAmount;
    }
}
