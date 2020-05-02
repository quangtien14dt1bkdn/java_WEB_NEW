package com.example.demo.service.impl;

import com.example.demo.model.Contract.Employee.Part;
import com.example.demo.repo.employee.PartRepository;
import com.example.demo.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PartServiceImpl implements PartService {
    @Autowired
    private PartRepository partRepository;
    @Override
    public Page<Part> findAll(Pageable pageable) {
        return partRepository.findAll(pageable);
    }

    @Override
    public Part findById(Long id) {
        return partRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Part part) {
        partRepository.save(part);

    }

    @Override
    public void remove(Long id) {
        partRepository.deleteById(id);
    }
}



