package com.example.demo.service;

import com.example.demo.model.Contract.Employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByName(String fullName, Pageable pageable);

    Employee findById(Long id);

    void save(Employee customer);

    void remove(Long id);
}
