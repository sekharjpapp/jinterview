package com.pixel.solid.LiskovSubstitution;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Video premiumVideo = new PremiumVideo();

        // Both work exactly the same way
        VideoPlayer player = new VideoPlayer();
        player.playVideoWithAds(premiumVideo);
    }
}
class VideoPlayer {
    public void playVideoWithAds(Video video) {
        video.playAd();  // Always safe, no exceptions
        video.play();
    }
}
