package com.tms.models;

import lombok.ToString;

@ToString
public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
