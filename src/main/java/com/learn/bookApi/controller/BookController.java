package com.learn.bookApi.controller;

import com.learn.bookApi.model.BookModel;
import com.learn.bookApi.service.BookService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "Livros")
@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ApiOperation("Lista todos os livros cadastrados")
    @ApiResponses({
            @ApiResponse(code = 200, message = "livros encontrados com sucesso!")
    })
    @GetMapping
    public List<BookModel> getBook(){
        return bookService.getAllBook();
    }

    @ApiOperation("Cadastra um livro")
    @PostMapping
    public BookModel postBook( @RequestBody @Valid BookModel bookModel){
        return bookService.createBook(bookModel);
    }

    @ApiOperation("Encontra o livro pelo nome")
    @GetMapping("/{name}")
    public BookModel getOneBookByName(@PathVariable @ApiParam(value = "titulo do livro", example = "O Alquimista") String name){
        return bookService.findBookByName(name);
    }
}
