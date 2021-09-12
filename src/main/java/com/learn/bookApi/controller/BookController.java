package com.learn.bookApi.controller;

import com.learn.bookApi.model.BookModel;
import com.learn.bookApi.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public List<BookModel> getBook(){
        return bookService.getAllBook();
    }

    @PostMapping("/book")
    public BookModel postBook(@RequestBody BookModel bookModel){
        return bookService.createBook(bookModel);
    }
}
