package com.tms.models;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда")
 */
@Getter
public class Pants extends Clothes implements MensClothing, WomensClothing {

    public Pants(int size, BigDecimal price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAMen() {
        System.out.println("На вас надеты штаны. Стоимость штанов: " + getPrice() + " Размер: " +
                getSize() + " Цвет штанов: " + getColor());
    }

    @Override
    public void dressAWoman() {
        System.out.println("На вас надеты штаны. Стоимость штанов: " + getPrice() + " Размер: " +
                getSize() + " Цвет штанов: " + getColor());
    }
}
