package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * Класс Фрукт содержит:
 * а) переменную вес,
 * б) метод printManufacturerInfo(){System.out.print("Made in Belarus");} который нельзя изменить в наследнике.
 * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
 * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
 */
@Getter
@AllArgsConstructor
public abstract class Fruit {
    private FruitType type;
    private double weight;
    private BigDecimal basePrice;

    public BigDecimal getPrice() {
        double margin;

        if (getWeight() <= type.getRangeFrom()) {
            margin = 1;
        } else if (getWeight() > type.getRangeFrom() && getWeight() <= type.getRangeTo()) {
            margin = 1.5;
        } else {
            margin = 1.7;
        }
        return basePrice.multiply(BigDecimal.valueOf(margin)).setScale(2);
    }

    public final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }
}
