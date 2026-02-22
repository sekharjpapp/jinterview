package com.pixel.designpatterns.decoratorfactory;

import com.pixel.designpatterns.decoratorfactory.factoryinput.PowerUp;
import java.util.List;

public class MarioGame {
    public static void main(String[] args) {

        Mario mario = MarioFactory.createMario(
                List.of(PowerUp.MUSHROOM, PowerUp.FIRE, PowerUp.STAR)
        );

        System.out.println(mario.getDescription());
        System.out.println("Power = " + mario.getPower());
    }
}
