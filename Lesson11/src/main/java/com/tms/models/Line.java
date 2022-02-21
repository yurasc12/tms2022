package com.tms.models;

import lombok.Getter;

@Getter
public class Line extends Figure {
    private double length;

    public Line(Type name, double length) {
        super(name);
        this.length = length;
    }


}
