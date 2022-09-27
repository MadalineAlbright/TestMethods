package com.example.testmethods.tests;

public class CryptoException extends Exception{
    public CryptoException() {
    }

    public CryptoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
