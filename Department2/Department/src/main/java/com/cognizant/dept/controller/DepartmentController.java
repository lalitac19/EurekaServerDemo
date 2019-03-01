package com.cognizant.dept.controller;

import com.cognizant.dept.domain.Department;
import com.cognizant.dept.repository.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentRepo repo;

    @GetMapping(path="/all")
    public List<Department> getAllDepartments() {
        log.info("Get all employee list invoked");
        return repo.getAllDept();
    }

    @GetMapping(path="/{id}")
    public Department getAlEmployees(@PathVariable Integer id) {
        log.info("Fetch information for ID " + id);
        return repo.getDepartment(id);
    }
}
