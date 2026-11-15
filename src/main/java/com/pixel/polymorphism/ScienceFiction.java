package com.pixel.polymorphism;

public class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
          super(title);
    }
    @Override
    public void watchMovie() {
         super.watchMovie();
       System.out.printf(".. %s%n".repeat(3),
                   "Bad Aliens do bad Stuff",
                    "Space Guys fight back",
                    "Planet blows up");
        }
}
