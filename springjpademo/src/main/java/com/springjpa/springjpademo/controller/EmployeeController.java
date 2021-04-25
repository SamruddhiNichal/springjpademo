package com.springjpa.springjpademo.controller;

import com.springjpa.springjpademo.model.Employee;
import com.springjpa.springjpademo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmployee")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Employee saved";
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }

    @GetMapping("/getEmp/{id}")
    public Optional<Employee> getEmp(@PathVariable Integer id){
        return employeeRepo.findById(id);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        Optional<Employee> emp=employeeRepo.findById(employee.getId());
        if(emp.isPresent()){
            emp.get().setLastName(employee.getLastName());
            emp.get().setCity(employee.getCity());
            employeeRepo.save(emp.get());
            return "Data updated";
        }
        return "Record not Found";

    }

    @PutMapping("deleteEmp/{id}")
    public String deleteEmp(@PathVariable Integer id){
        employeeRepo.deleteById(id);
        return "Deleted";
    }


}
