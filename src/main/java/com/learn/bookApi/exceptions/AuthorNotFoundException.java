package com.learn.bookApi.exceptions;

public class AuthorNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AuthorNotFoundException(String s) {
        super(s);
    }
}
