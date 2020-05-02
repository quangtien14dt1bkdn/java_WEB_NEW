package com.example.demo.service.impl;

import com.example.demo.model.Contract.Employee.Employee;
import com.example.demo.repo.employee.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Employee> findByName(String fullName, Pageable pageable) {
        return null;
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public void save(Employee customer) {
        employeeRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        employeeRepository.deleteById(id);
    }
}
