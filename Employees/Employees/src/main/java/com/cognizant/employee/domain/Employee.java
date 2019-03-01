package com.cognizant.employee.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder //builds object - constuctor
@Getter //creates getters
@Setter
public class Employee {

    private String name;
    private Integer ID;
    private String jobTitle;
    private long salary;
    private String deptName;

}
