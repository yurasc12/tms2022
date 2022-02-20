package com.tms.service;
/**
 * Задача1:
 * Интерфейс Инструмент
 * <p>
 * 1) Создать интерфейс Инструмент(внутри enum Type с перечислением типов инструментов) и реализующие его классы Гитара, Барабан и Труба.
 * 2) Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
 * 3) Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
 * 4) Создать массив типа Инструмент, содержащий инструменты разного типа.
 * 5) Наполнять массив инструментами необходимо через метод createInstrument,
 * который на вход принимает Тип инструмента(enum) и создает конкретный инструмент.
 * 6) В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
 * "Играет такой-то инструмент, с такими-то характеристиками".
 */

import com.tms.models.Drum;
import com.tms.models.Guitar;
import com.tms.models.Instrument;
import com.tms.models.Trumpet;

import static com.tms.models.Instrument.Type;
import static com.tms.models.Instrument.Type.*;


public class MainInstrument {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];

        instruments[0] = createInstrument(GUITAR);
        instruments[1] = createInstrument(DRUM);
        instruments[2] = createInstrument(TRUMPET);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    private static Instrument createInstrument(Type type) {
        switch (type) {
            case GUITAR:
                return new Guitar(7);
            case DRUM:
                return new Drum(100);
            case TRUMPET:
                return new Trumpet(50);
            default:
                return null;
        }

    }
}
