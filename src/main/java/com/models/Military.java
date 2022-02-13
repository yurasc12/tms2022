package com.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Military extends Air {
    private boolean ejectionSystem;
    public int numberRocket;

    /*  public Military(String model, int power, int maxSpeed, int weight, int wingspan, int runwayLength, boolean ejectionSystem, int numberRocket) {
          super(model, power, maxSpeed, weight, wingspan, runwayLength);
          this.ejectionSystem = ejectionSystem;
          this.numberRocket = numberRocket;
      }*/
// метод проверяет можно ли сделать выстрел
    public void getShot() {
        if (numberRocket > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void getEjection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование произошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("количество ракет: " + getNumberRocket() + " шт\n" +
                "система катапультирования: " + (isEjectionSystem() ? "есть" : "нет") + "\n");

    }
}
