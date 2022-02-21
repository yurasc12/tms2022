package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@ToString
public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
        System.out.println("Играет барабан. Размер барабана " + size);
    }
}
