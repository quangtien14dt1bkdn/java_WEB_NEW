package com.example.demo.service.impl;

import com.example.demo.model.Contract.Customer.Customer;
import com.example.demo.repo.customer.CustomerRepository;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findByFullNameContaining(String fullName, Pageable pageable) {
        return customerRepository.findByName(fullName, pageable);
    }


    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}