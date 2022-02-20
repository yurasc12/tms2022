package com.tms.models;

public interface Instrument {
    String KEY = "До мажор";

    void play();

    enum Type {
        GUITAR, DRUM, TRUMPET

    }
}
