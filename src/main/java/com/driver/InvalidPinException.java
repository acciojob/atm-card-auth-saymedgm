package com.driver;

public class InvalidPinException extends Throwable {
    public InvalidPinException(String message) {
        super(message);
    }
}