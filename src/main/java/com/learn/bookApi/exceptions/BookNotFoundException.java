package com.learn.bookApi.exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String s) {
        super(s);
    }
}
