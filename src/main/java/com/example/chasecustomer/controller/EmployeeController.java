package com.example.chasecustomer.controller;

import com.example.chasecustomer.DTO.EmployeeDTO;
import com.example.chasecustomer.Entity.Employee;
import com.example.chasecustomer.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDTO employeeDTO){

        return new ResponseEntity<>(employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);

    }
}
