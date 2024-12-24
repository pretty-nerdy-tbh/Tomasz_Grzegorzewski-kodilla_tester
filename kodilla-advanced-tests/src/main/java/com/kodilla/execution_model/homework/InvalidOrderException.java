package com.kodilla.execution_model.homework;

public class InvalidOrderException extends Exception{
    public InvalidOrderException() {
        super("Wrong order provided");
    }
}
