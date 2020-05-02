package com.example.demo.service.impl;

import com.example.demo.model.Contract.Service.ServiceType;
import com.example.demo.repo.service.TypeServiceRepository;
import com.example.demo.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    private TypeServiceRepository typeServiceRepository;

    @Override
    public Page<ServiceType> findAll() {
        return typeServiceRepository.findAll(Pageable.unpaged());
    }

    @Override
    public ServiceType findById(Long id) {
        return  typeServiceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ServiceType serviceType) {
        typeServiceRepository.save(serviceType);
    }

    @Override
    public void remove(Long id) {
        typeServiceRepository.deleteById(id);
    }
}
