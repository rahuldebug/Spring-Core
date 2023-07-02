package com.rahul.spring5.repositories;

import com.rahul.spring5.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
