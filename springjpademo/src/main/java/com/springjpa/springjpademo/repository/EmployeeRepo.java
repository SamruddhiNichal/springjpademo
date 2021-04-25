package com.springjpa.springjpademo.repository;

import com.springjpa.springjpademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
