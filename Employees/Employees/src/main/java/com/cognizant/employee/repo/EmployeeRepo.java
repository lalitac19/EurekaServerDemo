package com.cognizant.employee.repo;

import com.cognizant.employee.domain.Department;
import com.cognizant.employee.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepo {

    List<Employee> eList = new ArrayList<>();

    @Autowired
    IntDepartment departmentService;

    public EmployeeRepo(){
        eList.add(Employee.builder().name("Mark").jobTitle("Director").ID(12222).salary(2500000).build());
        eList.add(Employee.builder().name("Dec").jobTitle("Developer").ID(12442).salary(2500).build());
        eList.add(Employee.builder().name("Rishi").jobTitle("Senior Consultant").ID(12542).salary(30000).build());
    }

    public List<Employee> geteList() {
        return eList;
    }

    public Employee getEmployee(Integer id){
        Optional<Employee> employee = eList.stream().filter(emp -> emp.getID().equals(id)).findFirst();
        Department dept = departmentService.getAlEmployees(id);
        Employee emp  = employee.get();
        emp.setDeptName(dept.getDeptName());
        return emp;
    }
}
