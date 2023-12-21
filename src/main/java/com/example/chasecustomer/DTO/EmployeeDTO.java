package com.example.chasecustomer.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private int id;
    private String name;
    private int age;
    private String emailAddress;
    private int projectId;
}
