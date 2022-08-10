package com.thoughtworks.training.exception;

public class CinemaNotFoundException extends RuntimeException{
    public CinemaNotFoundException() {
        super("Cinema Not Found!!");
    }
}
