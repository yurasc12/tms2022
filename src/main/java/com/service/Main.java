package com.service;

import com.models.Civil;
import com.models.Freight;
import com.models.Military;
import com.models.Passenger;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = Passenger.builder().model("Audi")
                .power(160)
                .maxSpeed(200)
                .weight(2500)
                .numberWheels(4)
                .fuelConsumption(8)
                .bodyType("седан")
                .numberPassengers(5)
                .build();
        passenger.Info();
        passenger.printCountFuelDistance(3.5);
        System.out.println();

        Freight freight = Freight.builder().model("Volvo")
                .power(300)
                .maxSpeed(180)
                .weight(10000)
                .numberWheels(8)
                .fuelConsumption(18)
                .loadСapacity(18000)
                .build();
        freight.Info();
        freight.checkLoadCargo(25000);
        freight.checkLoadCargo(10000);
        freight.checkLoadCargo(0);
        System.out.println();

        Civil civil = Civil.builder().model("Boing")
                .power(1500)
                .maxSpeed(900)
                .weight(30000)
                .wingspan(50)
                .runwayLength(2000)
                .numberPassengers(300)
                .businessClass(true)
                .build();
        civil.Info();
        civil.checkPassengerCapacity(250);
        civil.checkPassengerCapacity(350);
        civil.checkPassengerCapacity(0);
        System.out.println();

        Military military = Military.builder().model("SU-35")
                .power(1550)
                .maxSpeed(2500)
                .weight(15000)
                .wingspan(30)
                .runwayLength(1500)
                .ejectionSystem(true)
                .numberRocket(8)
                .build();
        military.Info();
        military.getShot();
        military.getEjection();
    }
}
