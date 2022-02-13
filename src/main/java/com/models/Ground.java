package com.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
/**
 * Класс является наследником класса Transport и создае наземный траспорт
 * в него добавлены поля
 * -количество колес
 * -расход топлива на 100км
 */
public class Ground extends Transport {
    private int numberWheels;
    private int fuelConsumption;

    /* public Ground(String model, int power, int maxSpeed, int weight, int numberWheels, int fuelConsumption) {
         super(model, power, maxSpeed, weight);
         this.numberWheels = numberWheels;
         this.fuelConsumption = fuelConsumption;
     }*/

    @Override
    public void Info() {
        super.Info();
        System.out.print("количество колес: " + getNumberWheels() + " шт\n" +
                "расход топлива: " + getFuelConsumption() + " л на 100 км\n");
    }
}
