package com.pixel.solid.LiskovSubstitution;

import lombok.Data;

@Data
public abstract  class Video {

    private String title;
    private int time;
    private int likes;
    private int views;

    public abstract void playAd();
    public abstract void play();
}
