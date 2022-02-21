package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@ToString
public class Trumpet implements Instrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет труба.  Диаметр трубы " + diameter);
    }
}
