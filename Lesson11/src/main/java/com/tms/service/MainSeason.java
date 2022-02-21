package com.tms.service;

import com.tms.models.Season;

public class MainSeason {
    public static void main(String[] args) {

        Season season = Season.WINTER;
        System.out.println(season.getName() + " Средняя температура : " + season.getTemperature() + " " + season.getContent());
        System.out.println(season);
        System.out.println();

        System.out.println(printSeason(season));
        System.out.println();
        for (Season season1 : Season.values()) {
            System.out.println(season1.getName() + " Средняя температура : " + season1.getTemperature() + " " + season1.getContent());
            System.out.println(season1.getDescription());
        }
    }

    public static String printSeason(Season season) {
        String result = "Я люблю ";
        switch (season) {
            case WINTER -> {
                result += "Зиму";
            }
            case SPRING -> {
                result += "Весну";
            }
            case SUMMER -> {
                result += "Лето";
            }
            case AUTUMN -> {
                result += "Осень";
            }
        }
        return result;
    }
}
