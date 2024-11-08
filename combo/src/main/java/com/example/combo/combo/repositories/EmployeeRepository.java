package com.example.combo.combo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.combo.combo.entities.Employee;

// EmpleadoRepository.java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}