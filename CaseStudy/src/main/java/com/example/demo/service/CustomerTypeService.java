package com.example.demo.service;


import com.example.demo.model.Contract.Customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(Long id);

    void save(CustomerType customerType);

    void remove(Long id);
}
