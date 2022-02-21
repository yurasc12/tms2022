package com.tms.models;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда")
 */
@Getter
public class Tie extends Clothes implements MensClothing {

    public Tie(int size, BigDecimal price, String color) {
        super(size, price, color);
    }

    @Override
    public MensClothing dressMen() {
        System.out.println("На вас надет галстук. Стоимость галстука: " + getPrice() + " Размер: " +
                getSize() + " Цвет галстука: " + getColor());
        return null;
    }


}
