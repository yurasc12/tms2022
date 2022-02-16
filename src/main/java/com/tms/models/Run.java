package com.tms.models;

import static java.lang.Integer.MIN_VALUE;

/**
 * Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
 * Класс SonyHead является примером реализацией головы от Sony.
 * Создайте 3 робота с разными комплектующими.
 * Например у робота голова и нога от Sony а, рука от Samsung.
 * У всех роботов вызовите метод action.
 * Среди 3-х роботов найдите самого дорогого.
 */
public class Run {
    public static void main(String[] args) {
        Robot[] robots = new Robot[3];

        robots[0] = new Robot(new SonyHead(100), new SamsungHand(50), new ToshibaLeg(30));
        robots[1] = new Robot(new ToshibaHead(120), new SamsungHand(50), new SonyLeg(45));
        robots[2] = new Robot(new SamsungHead(95), new SonyHand(70), new SamsungLeg(55));

        System.out.println("Самый дорогой робот " + getMaxPriceRobot(robots));

        robots[0] = new Robot(new Head("Sony", 100), new Hand("Samsung", 50), new Leg("Toshiba", 30));
        robots[1] = new Robot(new Head("Toshiba", 120), new Hand("Samsung", 50), new Leg("Sony", 45));
        robots[2] = new Robot(new Head("Samsung", 95), new Hand("Sony", 70), new Leg("Samsung", 55));

        System.out.println("Самый дорогой робот " + getMaxPriceRobot(robots));

    }

    private static Robot getMaxPriceRobot(Robot[] robots) {
        int maxPrice = MIN_VALUE;
        int index = 0;

        for (int i = 0; i < robots.length; i++) {
            robots[0].action();
            if (robots[0].getPrice() > maxPrice) {
                maxPrice = robots[0].getPrice();
                index = i;
            }
        }
        return robots[index];
    }


}
