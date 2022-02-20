package com.tms.service;

import com.tms.models.Apple;
import com.tms.models.Apricot;
import com.tms.models.Fruit;
import com.tms.models.Pear;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

/**
 * Подсчитать общую стоимость проданных фруктов.
 * А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */
public class MainFruit {
    public static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();

        int toWeightApple = 300;
        int fromWeightApple = 60;
        BigDecimal basePriceApple = new BigDecimal(2.5);

        int toWeightPear = 170;
        int fromWeightPear = 70;
        BigDecimal basePricePear = new BigDecimal(8);

        int toWeightApricot = 45;
        int fromWeightApricot = 20;
        BigDecimal basePriceApricot = new BigDecimal(25);

        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple(generateWeight(toWeightApple, fromWeightApple), basePriceApple);
            fruits.add(apple);
            Pear pear = new Pear(generateWeight(toWeightPear, fromWeightPear), basePricePear);
            fruits.add(pear);
            Apricot apricot = new Apricot(generateWeight(toWeightApricot, fromWeightApricot), basePriceApricot);
            fruits.add(apricot);
        }
        getFruitCost(fruits);
    }

    private static void getFruitCost(ArrayList<Fruit> fruits) {
        BigDecimal totalCost = BigDecimal.ZERO;
        BigDecimal costOfApple = BigDecimal.ZERO;
        BigDecimal costOfApricot = BigDecimal.ZERO;
        BigDecimal costOfPear = BigDecimal.ZERO;

        for (Fruit fruit : fruits) {
            totalCost = totalCost.add(fruit.getPrice());
            if (fruit instanceof Apple) {
                costOfApple = costOfApple.add(fruit.getPrice());
            } else if (fruit instanceof Apricot) {
                costOfApricot = costOfApricot.add(fruit.getPrice());
            } else {
                costOfPear = costOfPear.add(fruit.getPrice());
            }

        }
        System.out.println("Сумарная стоимость всех фруктов " + totalCost + " руб.");
        System.out.println("Сумарная стоимость проданных яблок " + costOfApple + " руб.");
        System.out.println("Сумарная стоимость проданных абрикосов " + costOfApricot + " руб.");
        System.out.println("Сумарная стоимость проданных груш " + costOfPear + " руб.");

    }

    public static double generateWeight(int to, int from) {
        return (double) random.nextInt(to - from + 1) + from;
    }

}

