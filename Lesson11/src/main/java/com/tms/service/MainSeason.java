package com.tms.service;

import com.tms.models.Season;

public class MainSeason {
    public static void main(String[] args) {

        Season season = Season.WINTER;
        System.out.println(season.getName() + " Средняя температура : " + season.getTemperature() + " " + season.getContent());
        System.out.println(season);
        System.out.println();

        printSeason(season);
        System.out.println();
        for (Season season1 : Season.values()) {
            System.out.println(season1.getName() + " Средняя температура : " + season1.getTemperature() + " " + season1.getContent());
            System.out.println(season1.getDescription());
        }
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER -> {
                System.out.println("Я люблю Зиму");
            }
            case SPRING -> {
                System.out.println("Я люблю Весну");
            }
            case SUMMER -> {
                System.out.println("Я люблю Лето");
            }
            case AUTUMN -> {
                System.out.println("Я люблю Осень");
            }
        }
    }
}
