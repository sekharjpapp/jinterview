package com.pixel.designpatterns.decoratorfactory;

import com.pixel.designpatterns.decoratorfactory.factoryinput.PowerUp;
import java.util.List;

public class MarioFactory {

    public static Mario createMario(List<PowerUp> powerUps) {

        Mario mario = new BasicMario();

        for (PowerUp powerUp : powerUps) {
            mario = applyPowerUp(mario, powerUp);
        }

        return mario;
    }

    private static Mario applyPowerUp(Mario mario, PowerUp powerUp) {

        switch (powerUp) {
            case MUSHROOM:
                return new MushroomPower(mario);
            case FIRE:
                return new FirePower(mario);
            case STAR:
                return new StarPower(mario);
            default:
                throw new IllegalArgumentException("Unknown power-up: " + powerUp);
        }
    }
}

