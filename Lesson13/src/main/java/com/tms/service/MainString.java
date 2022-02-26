package com.tms.service;

import com.tms.models.WorkString;

import java.util.List;
import java.util.Objects;

public class MainString {
    public static void main(String[] args) {
        WorkString workString = new WorkString();

        String substr = workString.cutString("Good morning", 'm', 'g');

        //почему в первом случае идея заменила на эту конструкцию во вторм оставила?
        System.out.println(Objects.requireNonNullElse(substr, "crash test"));

        String substr1 = workString.cutString("Good morning", 'm', 'a');
        if (substr1 != null) {
            System.out.println(substr);
        } else {
            System.out.println("crash test");
        }


        String newString = workString.replaceString("good evеning my dear friend", 3, 0);
        if (newString != null) {
            System.out.println(newString);
        }


        List<String> listWord = workString.getPalindrome(new String[]{"поп", "дед", "казак", "сказка", "заказ", "быль", "топот"});
        if (listWord != null) {
            System.out.println(listWord);
        }
        String text = "Есть строка в которой содержится текст. Предложения разделены точками." +
                "После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов." +
                "Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран. " +
                "Казак скакал на большой гнедой лошади. Раздавался топот";
        List<String> strings = workString.parseText(text);
        if (strings != null) {
            for (String string : strings) {
                System.out.println(string);
            }
        }

        System.out.println(workString.getMidlChar("string"));
        System.out.println(workString.getMidlChar("code"));


        text = "Методы доступа называют ещё аксессорами (от англ. access — доступ), " +
                "или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)";

        System.out.println(workString.getCountWordLatinCharacters(text));


    }
}
