package com.thoughtworks.training.exception;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException() {
        super("Order Not Found!!");
    }
}
