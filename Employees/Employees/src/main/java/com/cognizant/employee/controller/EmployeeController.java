package com.cognizant.employee.controller;

import com.cognizant.employee.domain.Employee;
import com.cognizant.employee.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeRepo repo;

    @GetMapping(path="/all")
    public List<Employee> getAlEmployees() {
        log.info("Get all employee list invoked");
        return repo.geteList();
    }

    @GetMapping(path="/{id}")
    public Employee getAlEmployees(@PathVariable Integer id) {
        log.info("Fetch information for ID " + id);
        return repo.getEmployee(id);
    }
}
