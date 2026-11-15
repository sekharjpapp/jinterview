package com.pixel.qualifiervsprimary;

public class ImageContentStrategy implements ContentStrategy {
    @Override
    public void postProcess() {
        System.out.println("Image content strategy post processing");
    }
}
