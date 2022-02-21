package com.tms.models;

import java.util.ArrayList;

/**
 * Создать класс Ателье, содержащий методы одетьЖенщину,
 * * одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
 * * Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
 */
public class Studio {
    /*private ArrayList<Clothes> clothes;

    public Studio(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }*/

    public void dressedWomen(ArrayList clothes) {
        for (Object clothe : clothes) {
           /* if (clothe instanceof Tshirt) {
                Tshirt clothe1 = (Tshirt) clothe;
                System.out.println("Футболка : размер " + clothe1.getSize() + ", стоимость " + clothe1.getPrice() + ", цвет " + clothe1.getColor());
            } else if (clothe instanceof Pants) {
                Pants clothe1 = (Pants) clothe;
                System.out.println("Штаны : размер " + clothe1.getSize() + ", стоимость " + clothe1.getPrice() + ", цвет " + clothe1.getColor());
            } else if (clothe instanceof Skirt) {
                Skirt clothe1 = (Skirt) clothe;
                System.out.println("Юбка : размер " + clothe1.getSize() + ", стоимость " + clothe1.getPrice() + ", цвет " + clothe1.getColor());
            }*/
            if (clothe instanceof WomensClothing) {
                WomensClothing womensClothing = ((WomensClothing) clothe).dressWoman();
            }
        }
    }

    public void dressedMen(ArrayList clothes) {
        for (Object clothe : clothes) {
            /*if (clothe instanceof Tshirt) {
                Tshirt clothe1 = (Tshirt) clothe;
                System.out.println("Футболка : размер " + clothe1.getSize() + ", стоимость " + clothe1.getPrice() + ", цвет " + clothe1.getColor());
            } else if (clothe instanceof Pants) {
                Pants clothe1 = (Pants) clothe;
                System.out.println("Штаны : размер " + clothe1.getSize() + ", стоимость " + clothe1.getPrice() + ", цвет " + clothe1.getColor());
            } else if (clothe instanceof Tie) {
                Tie clothe1 = (Tie) clothe;
                System.out.println("Галстук : размер " + clothe1.getSize() + ", стоимость " + clothe1.getPrice() + ", цвет " + clothe1.getColor());
            }*/
            if (clothe instanceof MensClothing) {
                MensClothing mensClothing = ((MensClothing) clothe).dressMen();
            }
        }

    }
}
