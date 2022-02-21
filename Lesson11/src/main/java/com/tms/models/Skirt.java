package com.tms.models;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * Юбка (реализует интерфейсы "Женская Одежда")
 */
@Getter
public class Skirt extends Clothes implements WomensClothing {

    public Skirt(int size, BigDecimal price, String color) {
        super(size, price, color);
    }


    @Override
    public WomensClothing dressWoman() {
        System.out.println("На вас надета юбка. Стоимость юбки: " + getPrice() + " Размер: " +
                getSize() + " Цвет юбки: " + getColor());
        return null;
    }
}
