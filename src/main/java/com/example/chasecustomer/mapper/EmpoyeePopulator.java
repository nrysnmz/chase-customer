package com.example.chasecustomer.mapper;

import com.example.chasecustomer.DTO.EmployeeDTO;
import com.example.chasecustomer.Entity.Employee;
import com.example.chasecustomer.repository.EmployeeRepo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface EmpoyeePopulator {
    EmpoyeePopulator INSTANCE = Mappers.getMapper(EmpoyeePopulator.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creationDate", ignore = true)
    Employee populateEmployee(EmployeeDTO employeeDTO);

}
