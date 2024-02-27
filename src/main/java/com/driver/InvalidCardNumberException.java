package com.driver;

public class InvalidCardNumberException extends Throwable {
    public InvalidCardNumberException(String message) {
        super(message);
    }
}