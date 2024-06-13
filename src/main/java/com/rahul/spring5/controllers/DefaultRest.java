package com.rahul.spring5.controllers;

import com.rahul.spring5.model.Author;
import com.rahul.spring5.repositories.AuthorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/Library")
public class DefaultRest {
    //author service class will be created and added
    public DefaultRest() {
    }

    @GetMapping
    public List<Author> authorList(){

        return null;
    }
}
