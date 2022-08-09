package com.thoughtworks.training.exception;

public class MovieNotFoundEException extends RuntimeException{
    public MovieNotFoundEException() {
        super("Movie Not Found");
    }
}
