package com.cognizant.dept.repository;

import com.cognizant.dept.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class DepartmentRepo {

    private HashMap<Integer, Department> deptMap = new HashMap<>();

    public DepartmentRepo(){
        deptMap.put(12222, Department.builder().ID(12222).deptName("Digital Engineering").build());
        deptMap.put(12442, Department.builder().ID(12442).deptName("Interactive").build());
        deptMap.put(12542, Department.builder().ID(12542).deptName("Zone").build());
    }

    public List<Department> getAllDept(){
        List<Department> deptList = new ArrayList<>();
        deptMap.forEach((key, value) -> deptList.add(value));
        return deptList;
    }

    public Department getDepartment(Integer id){
        return deptMap.get(id);
    }

}
