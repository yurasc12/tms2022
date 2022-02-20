package com.tms.models;

import java.math.BigDecimal;

/**
 * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
 */
public class Pear extends Fruit {
    private BigDecimal basePrice;

    public Pear(double weight, BigDecimal basePrice) {
        super(weight);
        this.basePrice = basePrice;
    }

    @Override
    public BigDecimal getPrice() {
        double margin;

        if (getWeight() <= 20) {
            margin = 1;
        } else if (getWeight() > 20 && getWeight() <= 30) {
            margin = 1.5;
        } else {
            margin = 1.7;
        }
        return basePrice.multiply(BigDecimal.valueOf(margin)).setScale(2);
    }
}

