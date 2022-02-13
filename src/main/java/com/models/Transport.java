package com.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * класс описания транспорта
 * это родительский класс
 * содержит поля
 * -мощность лошадинные силы
 * -максимальная скорость км/ч
 * -масса кг
 * -модель
 */
//*@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public abstract class Transport {
    private String model;
    private int power;
    private int maxSpeed;
    private int weight;

    /* public Ground(String model, int power, int maxSpeed, int weight, int numberWheels, int fuelConsumption) {
                 super(model, power, maxSpeed, weight);
                 this.numberWheels = numberWheels;
                 this.fuelConsumption = fuelConsumption;
             }*/

    public double getPowerKv() {
        return 0.74 * getPower();
    }

    public void Info() {
        System.out.println("Модель : " + getModel() + " \n" +
                "мощность: " + getPowerKv() + " кВт\n" +
                "максимальная скорость: " + getMaxSpeed() + "км/ч" + "\n" +
                "вес: " + getWeight() + " кг");


    }

    public void info() {
    }
}