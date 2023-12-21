package com.example.chasecustomer.service;

import com.example.chasecustomer.DTO.EmployeeDTO;
import com.example.chasecustomer.Entity.Employee;
import com.example.chasecustomer.mapper.EmpoyeePopulator;
import com.example.chasecustomer.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee saveEmployee(EmployeeDTO employeeDTO){
        //code to convert dto to entity


        Employee employee = EmpoyeePopulator.INSTANCE.populateEmployee(employeeDTO);
        employee.setCreationDate(new Date());
        return employeeRepo.save(employee);

    }
}
