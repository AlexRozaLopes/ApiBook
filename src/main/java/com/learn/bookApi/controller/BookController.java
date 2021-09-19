package com.learn.bookApi.controller;

import com.learn.bookApi.model.BookModel;
import com.learn.bookApi.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookModel> getBook(){
        return bookService.getAllBook();
    }

    @PostMapping
    public BookModel postBook(@RequestBody BookModel bookModel){
        return bookService.createBook(bookModel);
    }

    @GetMapping("/{name}")
    public BookModel getOneBookByName(@PathVariable String name){
        return bookService.findBookByName(name);
    }
}
