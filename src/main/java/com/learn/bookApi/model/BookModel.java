package com.learn.bookApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Data
@Table(name = "Book")
public class BookModel {

    @Id
    @SequenceGenerator(sequenceName = "BOOK_SEQ", name = "bookGenerator", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookGenerator")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String title;
    @NotNull
    private int numberOfPages;
    @NotBlank
    private String genre;
    @ManyToOne
    private AuthorModel authorModel;


}



