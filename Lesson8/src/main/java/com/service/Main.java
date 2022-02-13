package com.service;

import com.models.Bouquet;
import com.models.FlowerMarket;

import static com.utils.Constants.*;

/**
 * Цветочный магазин.
 * Создать класс "Flower", который содержит переменные имя и стоимость, гет сет и toString (lombok подключаем)
 * Необходимо:
 * 1) собрать 5 букетов (используем массив) с определением их стоимости, т.е создаем класс Bouquet,
 * который содержит массив объектов Flower, который инициализируется через конструктор, а также метод по вычислению стоимости.
 * 2) вывести на консоль информацию по каждому букету.
 * 3*звездочка) Подсчитать количество всех проданных цветов.
 * Пояснения решения:
 * Создать класс FlowerMarket, который содержит метод public Bouquet getBouquet(String... flowers),
 * в классе Constants создать строковые константы названия цветов.
 * Для создания букета в метод getBouquet нужно передавать константы через запятую(ROSE, ROSE, ROSE, ROSE, ROSE)
 * По названию константы мы ищем стоимость цветка в 2-х мерном массиве
 * и преобразуем значение из строки в число, далее создаем через конструктор объект класса Flower и слаживаем в массив,
 * для передачи его в класс букета.
 * Заведомо в константах необходимо создать 2-х мерный массив типа String содержащий название цветка(константа) и его стоимость.
 * [ROSE] [15]
 * [LILY] [7]
 * [ASTER] [5]
 * [HERBERA] [5]
 * [TULIP] [8]
 * [CARNATION] [11]
 * Ps: если знаем другие конструкции, отличные от массива, то можно использовать.
 */
public class Main {

    public static void main(String[] args) {

        FlowerMarket flowerMarket = new FlowerMarket();

        Bouquet bouquet = flowerMarket.getBouquet(FLOWER_ROSE, FLOWER_ROSE, FLOWER_ROSE, FLOWER_ROSE, FLOWER_ROSE);
        bouquet.info();

        Bouquet bouquet1 = flowerMarket.getBouquet(FLOWER_ASTER, FLOWER_ASTER, FLOWER_ASTER, FLOWER_LILY, FLOWER_LILY, FLOWER_HERBERA, FLOWER_HERBERA);
        bouquet1.info();

        Bouquet bouquet2 = flowerMarket.getBouquet(FLOWER_ASTER, FLOWER_ROSE, FLOWER_ASTER, FLOWER_LILY, FLOWER_LILY,
                FLOWER_HERBERA, FLOWER_HERBERA);
        bouquet2.info();

        Bouquet bouquet3 = flowerMarket.getBouquet(FLOWER_TULIP, FLOWER_ROSE, FLOWER_TULIP, FLOWER_LILY, FLOWER_LILY,
                FLOWER_LILY, FLOWER_HERBERA, FLOWER_HERBERA, FLOWER_HERBERA);
        bouquet3.info();

        Bouquet bouquet4 = flowerMarket.getBouquet(FLOWER_TULIP, FLOWER_CARNATION, FLOWER_CARNATION);
        bouquet4.info();

        //getCountOfSoldFlowers - переменная пренадлижит классу а не его экземпляру
        // static работает только со статиком
        System.out.println("Всего продали цветов : " + FlowerMarket.getGetCountOfSoldFlowers());


    }
}