package com.learn.bookApi.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class AuthorModel {

    @SequenceGenerator(allocationSize = 10, name = "authorGenerator", sequenceName = "AUTHOR_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorGenerator")
    private long id;
    private String fullName;
    private String nationality;
    private LocalDate bithDate;

}
