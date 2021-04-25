package com.springjpa.springjpademo.repository;

import com.springjpa.springjpademo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
