package com.models;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
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

    public int getPriceBouqet() {
        int price = 0;
        for (Flower flower : flowersBouqet) {
            price = price + flower.getFlowerprice();
        }

        return price;
    }

    public void info() {
        List<String> flowerTemp = new ArrayList<>();
        for (Flower flower : flowersBouqet) {
            flowerTemp.add(flower.getFlowerName());
        }
        String resultString = "";
        for (String[] s : FLOWER_ARRAY) {
            int count = Collections.frequency(flowerTemp, s[0]);
            if (count != 0) {
                resultString = resultString + s[0] + ":" + count + " шт.\n";
            }
        }


        System.out.println("Стоимость букета : " + getPriceBouqet() + " руб.\n" + "Букет состоит из " + flowersBouqet.size() + " цветков");
        System.out.println(resultString);

        // return flowersBouqet.size(); // второй вариант подсчета цветов
    }
}
