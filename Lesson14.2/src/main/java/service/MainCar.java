package service;

import models.Car;
import models.Engine;
import models.FuelTank;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class MainCar {
    public static final String DIRNAME = "Lesson14.2/src/main/resources/";

    public static void main(String[] args) {
        Engine engine = Engine.builder()
                .type("ДВС")
                .numberCylinders(12)
                .build();
        FuelTank fuelTank = FuelTank.builder()
                .typeFuel("Бензин")
                .volume(60)
                .build();
        Car car = Car.builder()
                .model("Audi")
                .price(new BigDecimal("10000.00"))
                .speed(280.00)
                .engine(engine)
                .fuelTank(fuelTank)
                .build();
        System.out.println(car);
      /*  Engine engine = new Engine("ДВС", 12);
        FuelTank fuelTank =new FuelTank("Бензин",60);
        Car car =new Car("Audi",280,new BigDecimal("10000.00"),engine,fuelTank);*/

        String filename = DIRNAME + "car.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(car);
            System.out.println("Запись произошла");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Car newCar = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newCar = (Car) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(newCar);
        newCar.setPrice(new BigDecimal("20000"));
        System.out.println(newCar);

    }
}
