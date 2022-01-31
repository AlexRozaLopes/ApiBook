package com.learn.bookApi.controller;

import com.learn.bookApi.model.AuthorModel;
import com.learn.bookApi.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api("Autores")
@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @ApiOperation("lista todos os Autores cadastrados")
    @GetMapping
    public List<AuthorModel> getAuthor(){
        return authorService.findAllAuthor();
    }

    @ApiOperation("Cadastra um Autor")
    @PostMapping
    public AuthorModel postAuthor(@RequestBody @Valid AuthorModel authorModel){
        return authorService.createAuthor(authorModel);
    }

    @GetMapping("/{name}")
    public AuthorModel findByName(@PathVariable String name){
        return authorService.findByName(name);
    }
}
