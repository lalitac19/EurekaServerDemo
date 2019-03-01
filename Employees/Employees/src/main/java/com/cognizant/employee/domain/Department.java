package com.cognizant.employee.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Department {
    private long ID;
    private String deptName;
}
