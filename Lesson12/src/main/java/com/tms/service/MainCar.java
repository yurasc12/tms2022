package com.tms.service;

import com.tms.models.Car;
import com.tms.models.WrongCarException;

public class MainCar {
    public static void main(String[] args) {
        Car bmv = new Car("bmv", 230, 20000);
        try {
            bmv.getStart();
        } catch (WrongCarException exception) {
            exception.printStackTrace();
            //   exception.getMessage();
            // почему игнорит getMessage()?
        }

        Car lada = new Car("Lada", 180, 10000);
        try {
            lada.getStart();
        } catch (WrongCarException e) {
            e.printStackTrace();
        }
    }
}
