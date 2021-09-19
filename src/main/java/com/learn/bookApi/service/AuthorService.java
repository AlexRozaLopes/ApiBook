package com.learn.bookApi.service;

import com.learn.bookApi.model.AuthorModel;
import com.learn.bookApi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorModel> findAllAuthor() {
        return authorRepository.findAll();
    }

    public AuthorModel createAuthor(AuthorModel authorModel) {
        return authorRepository.save(authorModel);
    }
}
