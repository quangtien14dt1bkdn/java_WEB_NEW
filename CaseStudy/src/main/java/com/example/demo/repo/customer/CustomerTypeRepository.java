package com.example.demo.repo.customer;

import com.example.demo.model.Contract.Customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType,Long> {
}
