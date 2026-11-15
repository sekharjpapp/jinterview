package com.pixel.qualifiervsprimary;

public class VideoContentStrategy implements ContentStrategy {
    @Override
    public void postProcess() {
        System.out.println("Video content strategy post processing");
    }
}
