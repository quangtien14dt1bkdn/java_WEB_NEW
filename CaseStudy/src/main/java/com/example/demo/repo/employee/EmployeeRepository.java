package com.example.demo.repo.employee;


import com.example.demo.model.Contract.Employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    Page<Employee> findByName(String fullName, Pageable pageable);
}
