package com.example.demo.service.impl;

import com.example.demo.model.Contract.ContractDetail.Accompany;
import com.example.demo.repo.contract_detail.AccompanyRepository;
import com.example.demo.service.AccompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccompanyServiceImpl implements AccompanyService {
    @Autowired
    private AccompanyRepository accompanyRepository;

    @Override
    public Page<Accompany> findAll(Pageable pageable) {
        return accompanyRepository.findAll(pageable);
    }

    @Override
    public Accompany findById(Long id) {
        return accompanyRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Accompany accompany) {
        accompanyRepository.save(accompany);
    }

    @Override
    public void remove(Long id) {
        accompanyRepository.deleteById(id);
    }
}
