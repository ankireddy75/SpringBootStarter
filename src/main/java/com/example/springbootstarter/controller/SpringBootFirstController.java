package com.example.springbootstarter.controller;

import com.example.springbootstarter.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class SpringBootFirstController {


    @GetMapping(path = "/books")
    public List<Book> getBooks(){

       return Arrays.asList(new Book(1l,"first book","rama"),new Book(2l,"Second book","rama"));

    }
}
