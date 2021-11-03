package com.learn.bookApi.exceptions;

public class AuthorNotFoundException extends RuntimeException {
    public AuthorNotFoundException(String s) {
        super(s);
    }
}
