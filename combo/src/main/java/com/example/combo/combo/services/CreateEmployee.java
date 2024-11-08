package com.example.combo.combo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.combo.combo.repositories.EmployeeRepository;

import com.example.combo.combo.entities.Employee;

@Service
public class CreateEmployee {
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Listar todos los proyectos en la base de datos.
     *
     * @return una lista de proyectos
     */
    public Employee createEmployee(Employee empployee) {
        return employeeRepository.save(empployee);
    }
}
