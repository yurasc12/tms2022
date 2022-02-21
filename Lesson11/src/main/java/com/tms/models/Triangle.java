package com.tms.models;

import lombok.Getter;

@Getter
public class Triangle extends Figure implements ISquare {
    private double height;
    private double base;

    public Triangle(Type name, double height, double base) {
        super(name);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getSquare() {
        return 0.5 * base * height;
    }
}
