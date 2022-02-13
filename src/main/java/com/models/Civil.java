package com.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * потомок класса Air
 * добавлены поля количество пассажиров
 * наличие бизнес класса
 */
@Getter
@SuperBuilder
public class Civil extends Air {
    private int numberPassengers;
    private boolean businessClass;

  /*  public Civil(String model, int power, int maxSpeed, int weight, int wingspan, int runwayLength, int numberPassengers, boolean businessClass) {
        super(model, power, maxSpeed, weight, wingspan, runwayLength);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }*/

    public void checkPassengerCapacity(int numberPassengers) {
        if (numberPassengers <= getNumberPassengers() && numberPassengers > 0) {
            System.out.println("Самолет загружен");
        } else if (numberPassengers > 0) {
            System.out.println("Необходим другой самолет !!!");
        } else {
            System.out.println("неверный параметр!!!");
        }
    }


  /*  @Override
    public void info() {
        super.info();
        System.out.println("количество пассажиров: " + getNumberPassengers() + " чел.\n" +
                "наличие бизнес класса: " + (isBusinessClass() ? "есть" : "нет") + "\n");
    }*/

    @Override
    public void Info() {
        super.Info();
        System.out.println("количество пассажиров: " + getNumberPassengers() + " чел.\n" +
                "наличие бизнес класса: " + (isBusinessClass() ? "есть" : "нет") + "\n");
    }
}
