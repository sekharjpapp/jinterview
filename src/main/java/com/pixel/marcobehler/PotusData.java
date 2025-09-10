package com.pixel.marcobehler;

import java.util.Arrays;
import java.util.List;

public class PotusData {

    private List<Wife> wifesOfDonaldTrump = Arrays.asList(
            new Wife("Melania", Arrays.asList(
                    new Child("Barron", 12)
            )),
            new Wife("Marla", Arrays.asList(
                    new Child("Tiffany", 24)
            )),
            new Wife("Ivana", Arrays.asList(
                    new Child("Donald Trump Jr.", 40),
                    new Child("Ivanka", 36),
                    new Child("Eric", 34)
            ))
    );

    private List<Potus> potuses = Arrays.asList(
            new Potus("Donald", "Trump", 2016, "Republican", wifesOfDonaldTrump),
            new Potus("Barack", "Obama", 2012, "Democratic"),
            new Potus("Barack", "Obama", 2008, "Democratic"),
            new Potus("George W.", "Bush", 2004, "Republican"),
            new Potus("George W.", "Bush", 2000, "Republican"),
            new Potus("Bill", "Clinton", 1996, "Democratic"),
            new Potus("Bill", "Clinton", 1992, "Democratic"),
            new Potus("George H.W.", "Bush", 1988, "Republican"),
            new Potus("Ronald", "Reagan", 1984, "Republican"),
            new Potus("Ronald", "Reagan", 1980, "Republican"),
            new Potus("Jimmy", "Carter", 1976, "Democratic")
    );

    public List<Potus> getPotuses() {
        return potuses;
    }
}

