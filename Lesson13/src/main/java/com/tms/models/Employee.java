package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee implements Cloneable {
    private String fullName;
    private double salary;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
