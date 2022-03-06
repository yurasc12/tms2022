package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 4) Сериализовать объект Автомобиль(Марка, Двигатель(тип двигателя, количество цилиндров), бак(тип топлива, объем), скорость, цена). Количество цилиндров не должно сереализоватся в файл(это конфедициальная информация)
 * * После сериализации произвести обратный процесс(из потока в объект) и вывести на консоль
 */
@ToString
@Setter
@Getter
@Builder
public class Car implements Serializable {
    private String model;
    private double speed;
    private BigDecimal price;
    private Engine engine;
    private FuelTank fuelTank;

/*    public Car(String model, double speed, BigDecimal price, Engine engine, FuelTank fuelTank) {
        this.model = model;
        this.speed = speed;
        this.price = price;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }*/
}
