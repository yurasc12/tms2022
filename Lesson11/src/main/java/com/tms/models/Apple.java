package com.tms.models;

import java.math.BigDecimal;


/**
 * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
 */
public class Apple extends Fruit {
    public Apple(FruitType type, double weight, BigDecimal basePrice) {
        super(type, weight, basePrice);
    }
   /*@Override
    public BigDecimal getPrice() {
        double margin;

        if (getWeight() <= 100) {
            margin = 1;
        } else if (getWeight() > 100 && getWeight() <= 200) {
            margin = 1.3;
        } else {
            margin = 1.5;
        }
        return basePrice.multiply(BigDecimal.valueOf(margin)).setScale(2);
    }*/
}

