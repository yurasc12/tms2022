package com.tms.models;

import java.math.BigDecimal;

/**
 * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
 */
public class Apricot extends Fruit {
    public Apricot(FruitType type, double weight, BigDecimal basePrice) {
        super(type, weight, basePrice);
    }
/*    @Override
    public BigDecimal getPrice() {
        double margin;

        if (getWeight() <= 20) {
            margin = 1;
        } else if (getWeight() > 20 && getWeight() <= 30) {
            margin = 1.3;
        } else {
            margin = 1.8;
        }
        return basePrice.multiply(BigDecimal.valueOf(margin)).setScale(2);
    }*/
}

