package com.learn.bookApi.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class AuthorModel {

    @SequenceGenerator(allocationSize = 10, name = "authorGenerator", sequenceName = "AUTHOR_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorGenerator")
    private long id;

    @NotBlank
    private String fullName;
    @NotBlank
    private String nationality;
    @NotBlank
    private LocalDate bithDate;

}
