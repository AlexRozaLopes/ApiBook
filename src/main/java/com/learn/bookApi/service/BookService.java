package com.learn.bookApi.service;

import com.learn.bookApi.exceptions.BookNotFoundException;
import com.learn.bookApi.model.BookModel;
import com.learn.bookApi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookModel createBook(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    public List<BookModel> getAllBook() {
        return bookRepository.findAll();
    }

    public BookModel findBookByName(String name) {
        return bookRepository.findByTitle(name).orElseThrow(() -> new BookNotFoundException("Not found book with this name " + name));
    }
}
