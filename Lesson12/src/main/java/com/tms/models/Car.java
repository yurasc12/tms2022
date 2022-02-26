package com.tms.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class Car {
    private String model;
    private int speed;
    private int price;
    private Random random = new Random();

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }


    public void getStart() throws WrongCarException {
        int rnd = random.nextInt(20) + 1;
        if (rnd % 2 != 0) {
            System.out.println(model + " завелась!");
        } else {
            throw new WrongCarException("машина не завелась!");
        }
    }
}
