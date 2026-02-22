package com.pixel.enumcls;

public enum Generation {
    BABY_BOOMER(1946, 1964),
    GENERATION_X(1965, 1980),
    MILLENNIAL(1981, 1996),
    GENERATION_Z(1997, 2012),
    GENERATION_ALPHA(2013, 2025),
    SILENT_GENERATION(1928, 1945),
    GREATER_GENERATION(1901, 1927);

    private final int startYear;
    private final int endYear;

    Generation(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.name() + " (" + startYear + " - " + endYear + ")";
    }
}
