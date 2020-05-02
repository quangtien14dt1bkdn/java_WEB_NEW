package com.example.demo.service;

import com.example.demo.model.Contract.Customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByFullNameContaining(String fullName, Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
