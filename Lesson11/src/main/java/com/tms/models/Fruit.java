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
    private double weight;

    public abstract BigDecimal getPrice();

    public final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }
}
