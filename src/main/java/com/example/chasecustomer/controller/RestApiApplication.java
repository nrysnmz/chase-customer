package com.example.chasecustomer.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class RestApiApplication {
    @GetMapping("/books")
    public List<String> getBooks() {
        return Arrays.asList("Book 1", "Book 2", "Book 3");
    }
}
