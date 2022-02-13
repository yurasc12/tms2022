package com.models;

import lombok.ToString;

import java.util.List;

import static com.utils.Constants.FLOWER_ARRAY;

/**
 * т.е создаем класс Bouquet,
 * * который содержит массив объектов Flower, который инициализируется через конструктор, а также метод по вычислению стоимости.
 */
@ToString
public class Bouquet {
    private List<Flower> flowersBouqet;

    public Bouquet(List<Flower> flowersBouqet) {
        this.flowersBouqet = flowersBouqet;

    }

    public int getPrice() {
        int price = 0;
        for (Flower flower : flowersBouqet) {
            price = price + flower.getPrice();
        }
        return price;
    }

    public void info() {
        String resultString = "";
        for (String[] s : FLOWER_ARRAY) {
            int count = 0;
            for (Flower flower : flowersBouqet) {
                if (flower.getName().equalsIgnoreCase(s[0])) {
                    count++;
                }
            }
            if (count != 0) {
                resultString = resultString + s[0] + ":" + count + " шт.\n";
            }
        }
        System.out.println("Стоимость букета : " + getPrice() + " руб.\n" + "Букет состоит из " + flowersBouqet.size() + " цветков");
        System.out.println(resultString);
    }
}
