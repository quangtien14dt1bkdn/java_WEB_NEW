package com.example.demo.service;

import com.example.demo.model.Contract.Service.RentType;
import org.springframework.data.domain.Page;

public interface RentTypeService {
    Page<RentType> findAll();

    RentType findById(Long id);

    void save(RentType rentType);

    void remove(Long id);
}
