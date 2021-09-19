package com.learn.bookApi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BookModel {

    @Id
    @SequenceGenerator(sequenceName = "BOOK_SEQ", name = "bookGenerator", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookGenerator")
    private Long id;
    private String title;
    private int numberOfPages;
    private String genre;

    @ManyToOne
    private AuthorModel authorModel;

}



