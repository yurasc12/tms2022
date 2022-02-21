package com.tms.models;

import lombok.Getter;

@Getter
public class Rectangle extends Figure implements ISquare {
    private double length;
    private double width;

    public Rectangle(Type name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }


    @Override
    public double getSquare() {
        return length * width;
    }
}
