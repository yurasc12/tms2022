package by.tms.service;

import by.tms.model.Car;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("Audi", 2020, 0, "nnn", "999", 65, 45);

        // заправим машину
        car.fillCar();
        //  if (car.startCar()) {
        car.startCar();
        car.goCar();
        car.stopCar();

        //}

    }


}
