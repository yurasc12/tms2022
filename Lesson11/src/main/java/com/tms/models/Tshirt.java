package com.tms.models;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Tshirt extends Clothes implements MensClothing, WomensClothing {

    public Tshirt(int size, BigDecimal price, String color) {
        super(size, price, color);
    }

    @Override
    public MensClothing dressMen() {
        System.out.println("На вас надета футболка. Стоимость футболки: " + getPrice() + " Размер: " +
                getSize() + " Цвет футболки: " + getColor());
        return null;
    }

    @Override
    public WomensClothing dressWoman() {
        System.out.println("На вас надета футболка. Стоимость футболки: " + getPrice() + " Размер: " +
                getSize() + " Цвет футболки: " + getColor());
        return null;
    }
}
