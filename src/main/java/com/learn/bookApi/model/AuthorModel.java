package com.learn.bookApi.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "Author")
public class AuthorModel {

   @SequenceGenerator(allocationSize = 10, name = "authorGenerator", sequenceName = "AUTHOR_SEQ")
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorGenerator")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    private String fullName;
    @NotBlank
    private String nationality;
    @NotBlank
    private LocalDate birthDate;

}
