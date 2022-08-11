package com.thoughtworks.training.exception;

public class ArrangementNotFoundException extends RuntimeException{
    public ArrangementNotFoundException() {
        super("Arrangement Not Found!");
    }
}
