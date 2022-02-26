package com.tms.models;

public class WrongCarException extends Exception {
    public WrongCarException(String message) {
        super(message);
    }

    public WrongCarException() {
    }
}
