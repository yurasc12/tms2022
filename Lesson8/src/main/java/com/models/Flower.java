package com.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Flower {
    private String flowerName;
    private int flowerprice;

    public Flower(String flowerName, int floerprice) {
        this.flowerName = flowerName;
        this.flowerprice = floerprice;
    }
}
