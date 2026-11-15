package com.pixel.solid.LiskovSubstitution;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PremiumVideo extends Video{
    private int premiumId;

    @Override
    public void playAd() {
        // Instead of throwing exception, provide meaningful behavior
        System.out.println("✨ Premium content - No ads for " + getTitle());
        // Could show a "premium member" message or skip entirely
    }

    @Override
    public void play() {
        System.out.println("🎬 Playing premium video (ad-free): " + getTitle());
    }
}
