package com.springjpa.springjpademo.controller;

import com.springjpa.springjpademo.model.Department;
import com.springjpa.springjpademo.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping("/saveDept")
    public String saveDept(@RequestBody Department department){
        departmentRepo.save(department);
        return "Department saved";
    }
}
