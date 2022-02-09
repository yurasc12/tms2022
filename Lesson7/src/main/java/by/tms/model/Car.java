package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static by.tms.utils.Constans.DRIVING_DISTANCE;
import static by.tms.utils.Constans.FUEL_QUANTITY;

/**
 * Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).
 * - Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
 * - Реализуйте методы включения машины, который в свою очередь включает её двигатель.
 * - Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
 * - Если машина не заведена, ехать она не может.
 * - Машину можно заглушить.
 * - После каждой поездки считаем, что машина прошла фиксированное расстояние.
 * - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
 * - Чтобы создать машину обязательно нужно иметь двигатель и бензобак.
 * - Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
 * (не обязательно задавать в конструкторе)
 * - После создания поменять двигатель машине нельзя.
 * - Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
 * - Машину можно дозаправить, можно проверить сколько топлива осталось.
 * - Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака,
 * сколько бензина сейчас и т.д.
 */
@ToString
@Setter
@Getter
//@AllArgsConstructor
public class Car {

    private String model;
    private int yearModel;
    private int distance;
    private Engine engine;
    private boolean carStarted;
    private boolean carDriving;
    private String typeEngin;
    private String powerEngin;
    private FuelTank fuelTank;

    public Car(String model, int yearModel, int distance, String typeEngin, String powerEngin, int fuelTankVolume, int fuelQuantity) {
        this.model = model;
        this.yearModel = yearModel;
        this.distance = distance;
        this.typeEngin = typeEngin;
        this.powerEngin = powerEngin;
        this.engine = new Engine(typeEngin, powerEngin);
        this.fuelTank = new FuelTank(fuelTankVolume, fuelQuantity);
    }

    // метод старт машины
    public boolean startCar() {
        if (engine.startEngine()) {
            System.out.println("Машина завелась");
            carStarted = true;
        } else {
            System.out.println("Машина не завелась");
            carStarted = false;
        }
        return carStarted;
    }

    // метод езды машины
    public void goCar() {
        carDriving = true;
        System.out.println("Машина поехала");
    }

    // метод заглушить машину
    public void stopCar() {
        if (carDriving) {
            carDriving = false;
            distance += DRIVING_DISTANCE;
            int fuelQuantity = fuelTank.getFuelQuantity();
            fuelQuantity -= FUEL_QUANTITY;
            fuelTank.setFuelQuantity(fuelQuantity);
            System.out.println("Машина заглушна " + '\n' + "Пройденное растояние составляет :" + distance);
        } else {
            System.out.println("Машина заглушена");
        }
    }

    //метод заправить машину
    public void fillCar() {

        int fuelQuantity = fuelTank.getFuelQuantity();
        int fuelTankVolume = fuelTank.getFuelTankVolume();
        if (fuelQuantity == fuelTankVolume) {
            System.out.println("машину заправлять не надо!");
        } else {
            int quantity = fuelTankVolume - fuelQuantity;
            fuelTank.setFuelQuantity(quantity + fuelQuantity);
            System.out.println("машина запралена! " + '\n' + "залито топлива " + quantity);
        }


    }

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    private class Engine {
        private String typeEngin;
        private String powerEngin;

        // метод запуска двигателя
        private boolean startEngine() {
            int fuelQuantity = fuelTank.getFuelQuantity();
            if (fuelQuantity > 0) {
                return true;
            } else {
                return false;
            }

        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class FuelTank {
        private int fuelTankVolume;
        private int fuelQuantity; // текущее количество топлива

        public FuelTank() {
        }


        //вернуть количество топлива в баке
        public int getFuelCount() {
            System.out.println("Количество топлива в баке: " + fuelQuantity);
            return fuelQuantity;
        }
    }

}
