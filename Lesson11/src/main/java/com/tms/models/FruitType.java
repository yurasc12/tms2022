package com.tms.models;

import lombok.Getter;

@Getter
public enum FruitType {
    APPLE(100, 200), APRICOT(20, 30), PEAR(90, 120);
    private double rangeFrom;
    private double rangeTo;

    FruitType(double rangeFrom, double rangeTo) {
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }
}
