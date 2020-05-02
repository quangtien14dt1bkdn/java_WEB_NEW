package com.example.demo.service;

import com.example.demo.model.Contract.Service.ServiceType;
import org.springframework.data.domain.Page;

public interface ServiceTypeService {

    Page<ServiceType> findAll();


    ServiceType findById(Long id);

    void save(ServiceType serviceType);

    void remove(Long id);
}
