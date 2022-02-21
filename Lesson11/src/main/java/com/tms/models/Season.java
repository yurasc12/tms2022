package com.tms.models;

import lombok.Getter;

@Getter
public enum Season {
    WINTER("ЗИМА", -5.2, "Холодно идет снег, гололед"),
    SPRING("ВЕСНА", 18.5, "Тепло и дождливо"),
    SUMMER("ЛЕТО", 26, "Жарко, солнечно") {
        @Override
        public String getDescription() {
            return "Теплое время года ";
        }
    },
    AUTUMN("ОСЕНЬ", 15, "Пасмурно, дождливо");


    private String name;
    private Double temperature;
    private String content;

    Season(String name, double temperature, String content) {
        this.name = name;
        this.temperature = temperature;
        this.content = content;
    }

    public String getDescription() {
        return "Холодное время года ";
    }

}
