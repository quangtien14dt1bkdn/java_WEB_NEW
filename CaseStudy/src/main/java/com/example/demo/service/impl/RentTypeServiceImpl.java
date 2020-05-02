package com.example.demo.service.impl;

import com.example.demo.model.Contract.Service.RentType;
import com.example.demo.repo.service.TypeRentRepository;
import com.example.demo.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private TypeRentRepository rentTypeRepository;

    @Override
    public Page<RentType> findAll() {
        return rentTypeRepository.findAll(Pageable.unpaged());
    }

    @Override
    public RentType findById(Long id) {
        return  rentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(RentType rentType) {
        rentTypeRepository.save(rentType);
    }

    @Override
    public void remove(Long id) {
        rentTypeRepository.deleteById(id);
    }
}
