package com.example.demo.repo.customer;

import com.example.demo.model.Contract.Customer.Customer;
import com.example.demo.model.Contract.Employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Page<Customer> findByName(String fullName, Pageable pageable);
}
