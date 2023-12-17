package com.example.chasecustomer.controller;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/example")
class ExampleController {

    private final RestTemplate restTemplate;

    public ExampleController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/todo")
    public ResponseEntity<Todo> getTodoFromExternalApi() {
        // Define the external API endpoint URL
        String externalApiUrl = "https://jsonplaceholder.typicode.com/todos/1";

        // Make a GET request and get the response as a Todo object
        ResponseEntity<Todo> response = restTemplate.getForEntity(externalApiUrl, Todo.class);

        // Return the Todo object in the response
        return response;
    }
}

@Getter
@Setter
@Data
@NoArgsConstructor
class Todo {
    private int userId1;
    private int id;
    private int id1;
    private String title;
    private String title1;
    private boolean completed;
    private boolean completed2;

    // Getters and setters (or use Lombok for simplicity)


}
