package com.spring.basics.springtutorialbasics;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;


@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBookDetails(){
        return Arrays.asList(new Book(1,"The lord of the rings","G.R.R. Tolkeien", Book.cover.Bundle));
    }
}
