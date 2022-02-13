package com.models;

import java.util.ArrayList;

import static com.utils.Constants.FLOWER_ARRAY;

/**
 * Создать класс FlowerMarket, который содержит метод public Bouquet getBouquet(String... flowers),
 * в классе Constants создать строковые константы названия цветов.
 * Для создания букета в метод getBouquet нужно передавать константы через запятую(ROSE, ROSE, ROSE, ROSE, ROSE)
 * По названию константы мы ищем стоимость цветка в 2-х мерном массиве
 * и преобразуем значение из строки в число, далее создаем через конструктор объект класса Flower и слаживаем в массив,
 * для передачи его в класс букета.
 */

public class FlowerMarket {
    private static int getCountOfSoldFlowers;

    public static int getGetCountOfSoldFlowers() {
        return getCountOfSoldFlowers;
    }

    // получить букет
    public Bouquet getBouquet(String... flowerNames) {
        if (flowerNames.length > 0) {
            ArrayList<Flower> flowers = new ArrayList<>();
            for (String s : flowerNames) {
                for (String[] strings : FLOWER_ARRAY) {
                    if (strings[0].equalsIgnoreCase(s)) {
                        int priceFlower = Integer.parseInt(strings[1].trim());

                        Flower flower = new Flower(strings[0], priceFlower);
                        flowers.add(flower);
                    }

                }
            }

            getCountOfSoldFlowers += flowers.size();
            return new Bouquet(flowers);
        } else {
            return null;
        }
    }

}
