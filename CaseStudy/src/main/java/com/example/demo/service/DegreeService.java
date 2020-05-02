package com.example.demo.service;

import com.example.demo.model.Contract.Employee.Degree;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DegreeService {
    Page<Degree> findAll(Pageable pageable);

    Degree findById(Long id);

    void save(Degree degree);

    void remove(Long id);
}
