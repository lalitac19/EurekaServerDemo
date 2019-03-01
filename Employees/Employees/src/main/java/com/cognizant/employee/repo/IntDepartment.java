package com.cognizant.employee.repo;

import com.cognizant.employee.domain.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("department")
public interface IntDepartment {

    @GetMapping(path="/all")
    public List<Department> getAllDepartments();

    @GetMapping(path="/{id}")
    public Department getAlEmployees(@PathVariable Integer id);
}
