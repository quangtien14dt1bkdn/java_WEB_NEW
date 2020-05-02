package com.example.demo.service;


import com.example.demo.model.Contract.Service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceService {
    Page<Service> findAll(Pageable pageable);

    Page<Service> findAll();

    Service findById(Long id);

    void save(Service service);

    void remove(Long id);
}
