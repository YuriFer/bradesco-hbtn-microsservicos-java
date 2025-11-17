package com.example.demo.exception;

public class UserNameException extends RuntimeException {
    public UserNameException() {
        super("USERNAME");
    }
}
