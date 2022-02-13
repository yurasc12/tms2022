package com.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * создает класс который является потомком классов Transport
 * и Ground
 * добавлены поля
 * - тип кузова
 * - количество пассажиров
 */
@SuperBuilder
@Getter
public class Passenger extends Ground {
    private String bodyType;
    private int numberPassengers;

   /* public Passenger(String model, int power, int maxSpeed, int weight, int numberWheels, int fuelConsumption, String bodyType, int numberPassengers) {
        super(model, power, maxSpeed, weight, numberWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }*/


    // расчет количества топлива  и пройденной дистанции за время
    public void printCountFuelDistance(double time) {
        if (time > 0) {
            double distance = getDistance(time);
            double countFuel = distance / 100 * getFuelConsumption();

            System.out.println("За время " + time + " ч, автомобиль " + getModel() + " двигаясь с максимальной скоростью " + getMaxSpeed() +
                    " км/ч проедет " + distance + " км и израсходует " + countFuel + " литров топлива");
        } else {
            System.out.println("некоректный параметр");
        }

    }

    // рассчет пройденного расстояния
    private double getDistance(double time) {
        return time * getMaxSpeed();
    }


    @Override
    public void Info() {
        super.Info();
        System.out.println("тип корпуса: " + getBodyType() + "\n" +
                "количество пассажиров: " + getNumberPassengers() + " чел.\n");
    }
}
