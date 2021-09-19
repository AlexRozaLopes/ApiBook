package com.learn.bookApi.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class BookModel {

    @Id
    @SequenceGenerator(sequenceName = "BOOK_SEQ", name = "bookGenerator", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookGenerator")
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private int numberOfPages;
    @NotBlank
    private String genre;

    @ManyToOne
    private AuthorModel authorModel;

}



