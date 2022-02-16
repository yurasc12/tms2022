package com.tms.models;

import lombok.ToString;

@ToString
public class Hand implements IHand {
    private String name;
    private int price;

    public Hand(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Hand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука " + name);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
