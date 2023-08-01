package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
