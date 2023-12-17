package com.example.chasecustomer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateExample {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "http://localhost:8080/books";

        ResponseEntity<String[]> response = restTemplate.getForEntity(apiUrl,String[].class);
        String[] books =  response.getBody();
        System.out.println("Kitap listesi");

        for (String book : books){
            System.out.println(book);
        }

    }
}
