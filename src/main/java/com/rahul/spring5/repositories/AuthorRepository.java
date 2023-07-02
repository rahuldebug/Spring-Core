package com.rahul.spring5.repositories;

import com.rahul.spring5.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
