package com.tms.models;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Tshirt extends Clothes implements MensClothing, WomensClothing {

    public Tshirt(int size, BigDecimal price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAMen() {
        System.out.println("На вас надета футболка. Стоимость футболки: " + getPrice() + " Размер: " +
                getSize() + " Цвет футболки: " + getColor());
    }

    @Override
    public void dressAWoman() {
        System.out.println("На вас надета футболка. Стоимость футболки: " + getPrice() + " Размер: " +
                getSize() + " Цвет футболки: " + getColor());
    }
}
