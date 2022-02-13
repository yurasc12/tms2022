package com.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * Класс потом  родительского класса Transport
 * добавлены поля
 * размах крыльев
 * длина взлетной полосы
 */
@SuperBuilder
@Getter
public class Air extends Transport {
    private int wingspan;
    private int runwayLength;

    /* public Air(String model, int power, int maxSpeed, int weight, int wingspan, int runwayLength) {
         super(model, power, maxSpeed, weight);
         this.wingspan = wingspan;
         this.runwayLength = runwayLength;
     }*/

    @Override
    public void Info() {
        super.Info();
        System.out.print("размах крыльев: " + getWingspan() + " м\n" +
                "мин.длина взлетной полосы: " + getRunwayLength() + " м\n");
    }
}

