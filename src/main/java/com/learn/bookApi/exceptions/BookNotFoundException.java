package com.learn.bookApi.exceptions;

public class BookNotFoundException extends RuntimeException{
   
	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String s) {
        super(s);
    }
}
