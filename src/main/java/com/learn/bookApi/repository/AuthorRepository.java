package com.learn.bookApi.repository;

import com.learn.bookApi.model.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {
}
