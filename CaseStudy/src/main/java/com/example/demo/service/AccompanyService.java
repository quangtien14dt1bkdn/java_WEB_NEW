package com.example.demo.service;

import com.example.demo.model.Contract.ContractDetail.Accompany;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccompanyService {
    Page<Accompany> findAll(Pageable pageable);

    Accompany findById(Long id);

    void save(Accompany accompany);

    void remove(Long id);
}
