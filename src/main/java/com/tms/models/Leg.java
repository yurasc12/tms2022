package com.tms.models;

import lombok.ToString;

@ToString
public class Leg implements ILeg {
    private String name;
    private int price;

    public Leg(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Leg() {
    }

    @Override

    public void step() {
        System.out.println("Нога Sony делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
