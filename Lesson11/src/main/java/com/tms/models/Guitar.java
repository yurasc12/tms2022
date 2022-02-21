package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@ToString
public class Guitar implements Instrument {
    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Играет гитара. Количество струн у гитары " + numberOfStrings);
    }
}
