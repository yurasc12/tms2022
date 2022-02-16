package com.tms.models;

import lombok.ToString;

@ToString
public class Head implements IHead {
    private String name;
    private int price;


    public Head(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Head() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова " + name);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
