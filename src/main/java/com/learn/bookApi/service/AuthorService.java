package com.learn.bookApi.service;

import com.learn.bookApi.exceptions.AuthorNotFoundException;
import com.learn.bookApi.model.AuthorModel;
import com.learn.bookApi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorModel> findAllAuthor() {
        return Optional.of(authorRepository.findAll()).orElseThrow(() -> new AuthorNotFoundException("Dont have any Author in this API yet"));
    }

    public AuthorModel createAuthor(AuthorModel authorModel) {
        return authorRepository.save(authorModel);
    }

    public AuthorModel findByName(String name) {
        return authorRepository.findByFullName(name).orElseThrow(() -> new AuthorNotFoundException("Dont have any Author in this API yet"));
    }
}
