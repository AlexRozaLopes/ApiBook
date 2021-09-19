package com.learn.bookApi.controller;

import com.learn.bookApi.model.AuthorModel;
import com.learn.bookApi.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<AuthorModel> getAuthor(){
        return authorService.findAllAuthor();
    }

    @PostMapping
    public AuthorModel postAuthor(@RequestBody AuthorModel authorModel){
        return authorService.createAuthor(authorModel);
    }
}
