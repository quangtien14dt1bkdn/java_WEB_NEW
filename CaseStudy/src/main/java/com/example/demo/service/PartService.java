package com.example.demo.service;

import com.example.demo.model.Contract.Employee.Part;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PartService {
    Page<Part> findAll(Pageable pageable);

    Part findById(Long id);

    void save(Part part);

    void remove(Long id);
}
