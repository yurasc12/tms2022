package com.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * создает класс который является потомком классов Transport
 * и Ground
 * добавленно поле
 * - грузоподъемность
 */
@Getter
@SuperBuilder
public class Freight extends Ground {
    private int loadСapacity;

    /*public Freight(String model, int power, int maxSpeed, int weight, int numberWheels, int fuelConsumption, int loadСapacity) {
        super(model, power, maxSpeed, weight, numberWheels, fuelConsumption);
        this.loadСapacity = loadСapacity;
    }*/

// метод проверяет загрузку грузовика
    public void checkLoadCargo(int capacity) {
        if (capacity <= getLoadСapacity() && capacity > 0) {
            System.out.println("Грузовик загружен");
        } else if (capacity > 0) {
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Не верный параметр");
        }
    }


    @Override
    public void Info() {
        super.Info();
        System.out.println("грузоподъемность: " + getLoadСapacity() + " кг\n");
    }
}
