package com.rahul.spring5.bootstrap;

import com.rahul.spring5.model.Author;
import com.rahul.spring5.model.Book;
import com.rahul.spring5.repositories.AuthorRepository;
import com.rahul.spring5.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements CommandLineRunner {

    AuthorRepository authorRepository;
    BookRepository bookRepository;

    public Dataloader(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("dataloader run method run");
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        bookRepository.save(ddd);
        authorRepository.save(eric);

        System.out.println("dataloader run method run completed");
    }
}
