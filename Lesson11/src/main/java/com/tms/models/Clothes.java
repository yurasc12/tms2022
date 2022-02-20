package com.tms.models;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
 */
@Getter
public abstract class Clothes {
    private int size;
    private BigDecimal price;
    private String color;

    public Clothes(int size, BigDecimal price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
